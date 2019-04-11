package com.itheima.dao;

import com.itheima.po.User;

import java.util.List;


public interface IUserDao {

	 int addUser(User user);

	 int delUser(String user_id);

	 int delUsers(String[] user_ids);

	 int updateUser(User user);

	 User getUser(User user);

	 List<User>  listUsers(User user);

	 int listUsersCount(User user);

}
