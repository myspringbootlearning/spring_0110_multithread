package com.ymd.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TaskExecutorSpringApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(TaskExecutorSpringApplication.class, args);
	}
	
}
