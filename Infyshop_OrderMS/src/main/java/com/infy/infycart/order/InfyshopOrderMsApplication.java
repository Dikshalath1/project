package com.infy.infycart.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InfyshopOrderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyshopOrderMsApplication.class, args);
	}

}
