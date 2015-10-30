package com.pose.po.ph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pose.po.ph.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
