package com.ci.ems.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, 
HibernateJpaAutoConfiguration.class})
@ComponentScan({"com.ci.ems"})
@EnableMongoRepositories("com.ci.ems.dao")
public class EmsApplication {

    public static void main(String[] args) throws Exception {

         SpringApplication.run(EmsApplication.class, args);

    }
}
