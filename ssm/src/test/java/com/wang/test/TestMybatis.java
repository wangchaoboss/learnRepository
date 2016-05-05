package com.wang.test;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mybatis.spring.SqlSessionTemplate;

import com.wang.base.UnitTestBase;
import com.wang.model.User;

@RunWith(BlockJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
public class TestMybatis extends UnitTestBase {
	private static Logger log = Logger.getLogger(TestMybatis.class);
//	private static UserService us;

	public TestMybatis() {
		super("classpath:spring-mybatis.xml");
	}

	@Test
	public void queryUserList() {
		log.info("测试类TestMybatis");
		SqlSessionTemplate sql = super.getBean("sqlSessionTemplate");
		BasicDataSource bd = super.getBean("dataSource");
		log.info("最大连接数："+bd.getUsername());
		List<User> list = sql.selectList("test.queryUserList");
		log.info(list.toString());
	}
}
