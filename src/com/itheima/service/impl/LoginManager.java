package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.IRoomDao;
import com.itheima.dao.IUserDao;
import com.itheima.po.Room;
import com.itheima.po.User;
import com.itheima.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginManager {

	@Autowired
	IUserDao userDao;
	@Autowired
	IRoomDao roomDao;
	
	public IRoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(IRoomDao roomDao) {
		this.roomDao = roomDao;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * @Title: listRooms
	 * @Description: 房屋查询
	 * @param room
	 * @return List<Room>
	 */
	public List<Room> listRooms(Room room, int[] sum) {
		
		if (sum != null) {
			sum[0] = roomDao.listRoomsCount(room);
		}
		List<Room> rooms = roomDao.listRooms(room);

		
		return rooms;
	}


	/**
	 * @Title: listUsers
	 * @Description: 查询用户集合
	 * @param user
	 * @return List<Picnews>
	 */
	public List<User> listUsers(User user){
		List<User> users = userDao.listUsers(user);
		return users;
	}
	
	/**
	 * @Title: getUser
	 * @Description: 查询用户
	 * @param user
	 * @return User
	 */
	public User getUser(User user){
		System.out.println(user.toString());
		user.setUser_pass(Md5.makeMd5(user.getUser_pass()));
		User _user = userDao.getUser(user);
		System.out.println(_user.toString());
		return _user;
	}
	
}
