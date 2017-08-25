package com.folder.FolderWatchRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FolderWatchRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolderWatchRegistryApplication.class, args);
	}
}
