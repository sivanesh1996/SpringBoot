package com.payilagam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MyProjectApplication.class, args);
		Home obj=context.getBean(Home.class);
		obj.connect();
		
		Home obj1=context.getBean(Home.class);
		obj1.connect();
	}

}
