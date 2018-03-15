package com.ymd.learn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Async
	public void sayHello() {
		System.out.println("Hello Thread: " + Thread.currentThread().getId() + Thread.currentThread().getName());
	}
	
	@Async
	public void sayHelloWorld() {
		System.out.println("Hello World Thread" + + Thread.currentThread().getId() + Thread.currentThread().getName());
	}
}
