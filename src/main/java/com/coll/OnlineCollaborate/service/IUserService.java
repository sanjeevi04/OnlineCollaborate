package com.coll.OnlineCollaborate.service;

import java.util.List;

import com.coll.OnlineCollaborate.model.User;

public interface IUserService {
	List<User> userListbyStatus(String status);
	 List<User> getAllUsers();
	 User getUserById(int userId);
	 User getUserByUsername(String username);
	 User validateUser(User user);
	 boolean updateUser(User user);
	 boolean deleteUser(int userId);
	 boolean deactiveUser(int userId);
	 boolean updateUserProfile(String file,Integer userId);
	boolean addUser(User user);
	List<User> getAllDeactiveUser();
	boolean activeUser(int userId);
	
	boolean logoutUser(int userId);
}
