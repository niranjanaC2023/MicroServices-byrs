package com.nt.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
public class Spboot2xCloudOrderServiceByrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spboot2xCloudOrderServiceByrsApplication.class, args);
	}

}
