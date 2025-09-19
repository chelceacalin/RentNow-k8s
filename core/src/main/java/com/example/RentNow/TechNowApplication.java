package com.example.RentNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TechNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechNowApplication.class, args);
	}

}
