package com.alochol.empmanagerserver.constant.http.code;


/**
 * 全局错误码
 */
public enum ServiceResultCode {

    /**
     * 通用
     */
    SUCCESS("200000", "success"),
    PERMISSION_NO_ENOUGH("200001", "权限不足"),
    PARAM_EXCEPTION("200002", "参数异常"),
    SESSION_TIMEOUT("200003", "session 过期"),
    RESOURCE_UNFIND("200004", "找不到对应资源"),
    FREQUENTLY_REQUEST("200005", "请求过于频繁，服务器拒绝"),
    CODE_NOTRUE("200006", "验证码错误"),
    APP_ILLEGAL("200007", "非法APP"),
    RESOURCE_HAD_EXIST("200008", "资源已经存在"),
    ACTIVITI_EXCEPTION("200009", "流程异常"),

    TOKEN_EXPIRE("2000A0", "未登录或token过期"),

    CACHE_OPT_EXCEPTION("2000E0", " 操作缓存异常"),
    CACHE_SET_ERROR("2000E1", "设置缓存失败"),
    CACHE_KEY_NOT_EXIST("2000E2", "缓存key不存在"),
    SYSTEM_EXCEPTION("2000F0", "服务器异常"),
    UNKNOWN_EXCEPTION("2000FF", "未知异常"),
    NOT_MODIFID("2000F1", "修改失败"),
    NOT_INSERT("2000F1", "插入失败"),


    /*----------------- 业务错误码 300000~400000 --------------------*/
    /**
     * 用户相关
     */
    NOT_LOGON("301100", "没有登陆"),
    USER_PASSWORD_ERR("301101", "用户名或密码错误"),
    USER_UNEXIST("301102", "用户不存在"),
    USER_OLDPASSWORD_ERR("301103", "原密码错误"),
    USER_HAD_EXIST("301104", "用户已经存在"),
    USER_INVITECODE_ERR("301105", "邀请码不存在或已经期"),
    USER_INVITECODE_EXITS("301106", "被邀请的客户已存在"),
    USER_NO_CROP("301107", "用户未关联企业"),
    USER_NO_ROLE("301108", "用户企业"),
    LOGIN_NOT_OPEN("301109", "没开启登录"),


    /**
     * 组织相关
     */
    CORP_HAD_EXIST("301201", "组织已经存在"),
    CORP_UNFIND("301202", "组织不存在"),

    /**
     * 产品及类型
     */
    ASSETSTYPE_INUSED("301301", " 存在此类产品，不可操作"),
    ASSETSTYPE_HAD_EXIST("301302", " 资产类型已经存在"),
    INPUT_EXCEL_ERRO("301305", " 上传文件格式有误"),

    /**
     * 资产领用
     */
    ORDER_REQU_UNFIND("301501", " 资产不在库存"),
    STORE_BANNED("301502", " 资产不在库存"),

    /**
     * 员工
     */
    SysUser_UNEXSIT("301601", " 员工不存在"),
    SysUser_EXSIT("301602", " 员工已存在"),

    /**
     * 组织
     */
    DEPART_NOT_EMPTY("301701", "组织下存在员工"),

    /**
     * 盘点单
     */
    NOT_DELETET("401701", "没有删除"),

    /**
     * 仓库
     */
    STORE_UNEXSIT("401702","仓库存在"),
    /**
     * 微信
     */
    MOBILE_WX_UNBIND("501007", "用户未绑定微信"),


    /**
     * 系统默认资源
     */
    UNEDIT_SYSTEM_DEFAULT("601001", "系统默认不可编辑"),

    /**
     * 角色权限
     */
    ROLE_ON_USED("701001", "角色使用中"),
    ROLE_NAME_EXSIT("701002", "角色已经存在");



    private String code;
    private String message;

    private ServiceResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ServiceResultCode getByCode(String code) {
        for (ServiceResultCode c : ServiceResultCode.values()) {
            if (c.code.equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    public static String getNameByCode(String code) {
        for (ServiceResultCode c : ServiceResultCode.values()) {
            if (c.code.equalsIgnoreCase(code)) {
                return c.message;
            }
        }
        return null;
    }
}
