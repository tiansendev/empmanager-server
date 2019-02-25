package com.alochol.empmanagerserver.config.auth;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionRequired {

    UserRole[] role() default {UserRole.SYSTEM_MANAGER, UserRole.COMMON_MANAGER};
}
