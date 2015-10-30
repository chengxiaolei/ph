package com.pose.po.ph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pose.po.ph.model.User;
import com.pose.po.ph.service.UserService;

@Controller
public class UserCotroller {

	@Autowired
	private UserService userService;
	@RequestMapping("/home")
	public String index(Model model){
		User u=userService.findOne(1);
		model.addAttribute("name", u.getName());
		return "/index";
	}
}
