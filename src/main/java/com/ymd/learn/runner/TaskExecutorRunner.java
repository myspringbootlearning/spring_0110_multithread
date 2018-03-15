package com.ymd.learn.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.ymd.learn.service.HelloService;

@Component
public class TaskExecutorRunner implements CommandLineRunner{

	@Autowired
	private ApplicationContext applicationContext;
	
	public void run(String... args) throws Exception {
		HelloService helloService = applicationContext.getBean(HelloService.class);
		helloService.sayHello();
		helloService.sayHelloWorld();
		System.out.println(Thread.currentThread());
	}
}
