package com.OnlineMedicalShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.Medicine")
//@EntityScan(basePackages="com.OnlineMedicalShop.model")
//@EnableJpaRepositories(basePackages="com.OnlineMedicalShop.repository")
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.OnlineMedicalShop")
public class OnlineMedicalShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMedicalShopApplication.class, args);
		System.out.println("Server running");
	}

}
