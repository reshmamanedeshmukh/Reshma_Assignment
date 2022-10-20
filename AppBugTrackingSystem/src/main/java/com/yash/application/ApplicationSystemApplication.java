package com.yash.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.yash.application"})
@EnableJpaRepositories
@ComponentScan()
public class ApplicationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSystemApplication.class, args);
	}

}
