package com.springboot.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
public class SaveYourBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveYourBookApplication.class, args);
	}

}
