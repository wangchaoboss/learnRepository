package com.wang.dao;

import java.util.List;


import com.wang.model.User;

public interface UserDao {
  public List<User> queryUserList();
}
