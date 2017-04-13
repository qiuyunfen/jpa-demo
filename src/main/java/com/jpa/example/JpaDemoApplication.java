package com.jpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		init();
		SpringApplication.run(JpaDemoApplication.class, args);
	}
	public static void init() {
		try {
			org.h2.tools.Server.createTcpServer().start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
