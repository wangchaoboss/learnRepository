package com.wang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wang.dao.UserDao;
import com.wang.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	//对应xml文件里的sqlSessionFactoryBeanName  也可以使用SqlSessionTemplate
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	Logger log = Logger.getLogger(UserDaoImpl.class);

	@Override
	public List<User> queryUserList() {
		log.info("UserImpl类日志输出");
		return sqlSessionTemplate.selectList("com.wang.dao.queryUserList");
	}

}
