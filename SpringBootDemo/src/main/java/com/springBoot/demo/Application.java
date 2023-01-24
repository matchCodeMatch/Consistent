package com.springBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Home home1 = context.getBean(Home.class);
		home1.runHome();

//		To check the prototype scope of bean.

//		Home home2 = context.getBean(Home.class);
//		home2.runHome();
	}
}
