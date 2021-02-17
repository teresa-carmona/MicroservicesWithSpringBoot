package com.microservices.udemy.eurekaclient.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientSubjectApplication.class, args);
	}

}
