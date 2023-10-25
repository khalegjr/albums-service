package com.appdeveloperblog.ws.api.photosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlbumsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsServiceApplication.class, args);
	}

}
