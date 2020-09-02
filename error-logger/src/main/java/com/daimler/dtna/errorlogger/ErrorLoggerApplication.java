package com.daimler.dtna.errorlogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ErrorLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErrorLoggerApplication.class, args);
	}

}
