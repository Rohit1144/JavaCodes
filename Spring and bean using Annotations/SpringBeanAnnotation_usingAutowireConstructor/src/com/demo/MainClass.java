package com.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.pojo.Employee;


//using DI auto-wired using setter based

public class MainClass {

	public static void main(String[] args) {
                    //spring ioc-----search for beans and here employee is bean connected with address
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = context.getBean(Employee.class);

	

	}
}
