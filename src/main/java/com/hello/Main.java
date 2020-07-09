package com.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		HelloWorld helloWorldObj = (HelloWorld) context.getBean("helloWorld");
		HelloPakistan helloPakObj = (HelloPakistan) context.getBean("helloPakistan");

		helloWorldObj.setMessage("Hi");
		System.out.println(helloWorldObj.getMessage());

		HelloWorld helloWorldObj2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorldObj2.getMessage());

		helloPakObj.setMessage("Hello");
		System.out.println(helloPakObj.getMessage());

		HelloPakistan helloPakObj2 = (HelloPakistan) context.getBean("helloPakistan");
		System.out.println(helloPakObj2.getMessage());

		context.registerShutdownHook();
	}

}
