package com.pose.po.ph;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pose.po.ph.model.User;

public class AppTest {

	@Test
	public void test(){
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u=(User) ctx.getBean("ph_user");
		System.out.println(u.getName());
	}
}
