package com.pose.po.ph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pose.po.ph.model.User;
import com.pose.po.ph.repository.UserDao;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findOne(int id){
		return userDao.findOne(id);
	}
	public void save(User u){
		userDao.save(u);
	}
	
	public User findUserByName(String name){
		return userDao.findOneByName(name);
	}
	
	
	
	
	
	
}
