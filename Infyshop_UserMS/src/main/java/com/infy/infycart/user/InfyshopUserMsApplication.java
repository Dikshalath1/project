package com.infy.infycart.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InfyshopUserMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyshopUserMsApplication.class, args);
	}

}
