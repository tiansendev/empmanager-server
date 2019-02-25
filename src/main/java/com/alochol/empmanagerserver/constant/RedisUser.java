package com.alochol.empmanagerserver.constant;

import com.alochol.empmanagerserver.mybatis.model.Manager;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class RedisUser{
    private Manager user;
    public final static long TOKEN_EXPIRE=12*60*60*1000;
}