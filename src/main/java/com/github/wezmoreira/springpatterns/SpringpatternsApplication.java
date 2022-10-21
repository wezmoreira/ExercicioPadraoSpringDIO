package com.github.wezmoreira.springpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpatternsApplication.class, args);
	}

}
