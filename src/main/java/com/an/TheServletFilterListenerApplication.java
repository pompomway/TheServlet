package com.an;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TheServletFilterListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheServletFilterListenerApplication.class, args);
	}

}
