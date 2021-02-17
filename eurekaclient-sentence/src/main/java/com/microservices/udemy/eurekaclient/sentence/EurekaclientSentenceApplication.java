package com.microservices.udemy.eurekaclient.sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientSentenceApplication.class, args);
	}

}
