package com.pose.po.ph;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pose.po.ph.model.User;
import com.pose.po.ph.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext_test.xml" })
public class UserTest {

	@Autowired
	public UserService userService;
	
	@Test
	public void findOne(){
		User u=userService.findOne(1);
		System.out.println(u.getName());
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext_test.xml"});
		
		UserService us=(UserService) ac.getBean("userService");
		User u=us.findOne(1);
		System.out.println(u.getName());
	}
	
}
