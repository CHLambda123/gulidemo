package com.guigu.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.guigu.thirdparty")
public class GulimallThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallThirdPartyApplication.class, args);
	}

}
