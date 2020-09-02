package com.daimler.dtna.pinvalidationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PinValidationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinValidationServiceApplication.class, args);
	}

}
