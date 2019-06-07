package com.across.across;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.across.across", "com.across.across.config", "com.across.across.api.dao", "com.across.across.api.service", "com.across.across.api.web"})
public class AcrossApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcrossApplication.class, args);
	}

}




