package com.demo.adminuiserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminuiserverApplication {

    /**
     * Springboot监控中心 启动AdminUI-SERVER
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(AdminuiserverApplication.class, args);
    }
}
