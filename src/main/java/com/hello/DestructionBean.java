package com.hello;

import org.springframework.beans.factory.DisposableBean;

public class DestructionBean implements DisposableBean {
	
	public void destroy(){
		System.out.println("Bean destroy method called");
	}
}
