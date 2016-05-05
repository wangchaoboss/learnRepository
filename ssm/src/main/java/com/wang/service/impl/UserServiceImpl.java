package com.wang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.dao.impl.UserDaoImpl;
import com.wang.model.User;
import com.wang.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDaoImpl udi;
	//private UserDao udi  使用接口时报错   还没弄明白

	@Override
	public List<User> getName() {
		return udi.queryUserList();
	}

}
