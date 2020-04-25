package com.example.billfirst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.billfirst.dao")
@SpringBootApplication
public class BillfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillfirstApplication.class, args);
	}

}
