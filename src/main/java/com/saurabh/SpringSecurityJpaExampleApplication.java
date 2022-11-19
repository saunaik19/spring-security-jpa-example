package com.saurabh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringSecurityJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaExampleApplication.class, args);
	}

}
