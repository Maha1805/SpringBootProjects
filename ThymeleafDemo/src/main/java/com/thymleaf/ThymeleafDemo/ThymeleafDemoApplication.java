package com.thymleaf.ThymeleafDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.thymleaf.ThymeleafDemo"})
@EnableJpaRepositories(basePackages="com.thymleaf.ThymeleafDemo.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.thymleaf.ThymeleafDemo.model")
@SpringBootApplication
public class ThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
	}

}
