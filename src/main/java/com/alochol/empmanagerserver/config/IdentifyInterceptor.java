package com.alochol.empmanagerserver.config;

import com.alibaba.fastjson.JSON;
import com.alochol.empmanagerserver.config.auth.PermissionRequired;
import com.alochol.empmanagerserver.config.auth.UserRole;
import com.alochol.empmanagerserver.config.cache.CacheService;
import com.alochol.empmanagerserver.constant.http.code.ServiceResultCode;
import com.alochol.empmanagerserver.constant.http.model.ServiceResult;
import com.alochol.empmanagerserver.mybatis.model.Manager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

@Configuration
public class IdentifyInterceptor extends HandlerInterceptorAdapter {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "ehcacheService")
	private CacheService cacheService;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		PermissionRequired annotation = method.getAnnotation(PermissionRequired.class);
		String token=request.getHeader("Authorization");
		if (annotation != null) {
			if(null==token || token.equals("")) {
				writeResponse(ServiceResult.failure(ServiceResultCode.PERMISSION_NO_ENOUGH), response);
				return false;
			}
			Manager manager=cacheService.get(token,Manager.class);
			if(null==manager) {
				// token 过期
				writeResponse(ServiceResult.failure(ServiceResultCode.TOKEN_EXPIRE), response);
				return false;
			}
			UserRole[] roles = annotation.role();
			UserRole userRole=UserRole.getByRoleId(manager.getRole_id());
			if(!Arrays.asList(roles).contains(userRole)) {
				writeResponse(ServiceResult.failure(ServiceResultCode.PERMISSION_NO_ENOUGH), response);
				return false;
			}
		}
		if(null!=token) {
			Manager manager=cacheService.get(token,Manager.class);
			UserContextThreadLocal.setCacheUsermanager(manager);
		}
		return true;
	}

	private void writeResponse(ServiceResult serviceResult, HttpServletResponse response) {
		String code = serviceResult.getCode();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(JSON.toJSONString(ServiceResult.failure(code)));
			writer.flush();
		} catch (IOException e) {
		} finally {
			if (null != writer) {
				writer.close();
			}
		}
	}
}
