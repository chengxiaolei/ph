package com.pose.po.ph;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pose.po.ph.model.User;
import com.pose.po.ph.service.UserService;

public class AppTest {

	@Test
	public void test(){
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us=(UserService) ctx.getBean("userService");
		User u=us.findOne(1);
		System.out.println(u.getName());
	}
}
