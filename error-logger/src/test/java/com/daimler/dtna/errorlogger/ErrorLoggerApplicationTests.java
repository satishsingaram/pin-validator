package com.daimler.dtna.errorlogger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.discovery.enabled=false"})
class ErrorLoggerApplicationTests {

	@Test
	void contextLoads() {
	}

}
