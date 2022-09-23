package com.yobitrust.HachCovid19Back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HachCovid19BackApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HachCovid19BackApplication.class, args);
	}

};

