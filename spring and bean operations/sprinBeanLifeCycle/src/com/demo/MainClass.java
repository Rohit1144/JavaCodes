package com.demo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String args[]) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beans.xml");
		
		
		cap.close();
	}

}
