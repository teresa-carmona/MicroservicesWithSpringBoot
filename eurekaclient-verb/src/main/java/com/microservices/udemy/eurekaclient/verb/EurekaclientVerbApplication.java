package com.microservices.udemy.eurekaclient.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientVerbApplication.class, args);
	}

}
