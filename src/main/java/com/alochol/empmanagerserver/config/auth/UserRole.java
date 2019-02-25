package com.alochol.empmanagerserver.config.auth;

public enum UserRole {
    SYSTEM_MANAGER("系统管理员", 100),
    COMMON_MANAGER("普通管理员", 99);

    // 成员变量
    private String name;
    private int roleId;

    private UserRole(String name, int roleId) {
        this.name = name;
        this.roleId = roleId;
    }

    public static String getName(int roleId) {
        for (UserRole c : UserRole.values()) {
            if (c != null && c.getRoleId()==roleId) {
                return c.name;
            }
        }
        return null;
    }
    public static UserRole getByRoleId(int roleId) {
        for (UserRole c : UserRole.values()) {
            if (c != null && c.getRoleId()==roleId) {
                return c;
            }
        }
        return null;
    }
    public static UserRole getByName(String name) {
        for (UserRole c : UserRole.values()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
