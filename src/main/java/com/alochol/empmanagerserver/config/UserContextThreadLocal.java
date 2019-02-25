package com.alochol.empmanagerserver.config;


import com.alochol.empmanagerserver.mybatis.model.Manager;

import java.io.Serializable;

public class UserContextThreadLocal implements Serializable {

    private static ThreadLocal<Manager> managerThreadLocal=new ThreadLocal<>();

    public static Manager getCacheUsermanager() {
        return managerThreadLocal.get();
    }

    public static void setCacheUsermanager(Manager manager) {
        managerThreadLocal.set(manager);
    }

    public static void removeUser() {
        managerThreadLocal.remove();
    }
}
