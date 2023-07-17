package com.example.bootcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class BootcicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcicdApplication.class, args);
	}

}
