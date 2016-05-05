package com.wang.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wang.model.User;
import com.wang.service.UserService;

@Controller
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/testmybatis.do",method=RequestMethod.GET)
	public String test(){
		log.info("log4j输出日志");
		List<User> l = userservice.getName();
		System.out.println("从数据库查出来的人是："+l);
		for (User user : l) {
			log.info(user.toString());
		}
		return "user";
	}
	
	@RequestMapping(value="/test2.do",method=RequestMethod.GET)
	public String test2(){
		log.info("这是test2.do");
		return "user";
		
	}
}
