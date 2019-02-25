package com.alochol.empmanagerserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.alochol.empmanagerserver.mybatis.dao")
public class EmpmanagerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpmanagerServerApplication.class, args);
    }

}
