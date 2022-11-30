package com.ci.ems.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ci.ems.controller.EmsRegistrationController;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, 
HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages="com.ci.ems")
public class EmsApplication {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(EmsApplication.class, args);

    }
}
