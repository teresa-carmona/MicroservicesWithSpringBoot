package com.microservices.udemy.eurekaclient.complements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientComplementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientComplementsApplication.class, args);
	}

}
