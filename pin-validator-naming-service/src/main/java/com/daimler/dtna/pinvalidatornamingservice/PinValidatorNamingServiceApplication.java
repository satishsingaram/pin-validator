package com.daimler.dtna.pinvalidatornamingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PinValidatorNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinValidatorNamingServiceApplication.class, args);
	}

}
