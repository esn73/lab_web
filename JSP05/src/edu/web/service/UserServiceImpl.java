package edu.web.service;

import java.util.List;

import edu.web.domain.Board;
import edu.web.domain.User;
import edu.web.persistence.BoardDao;
import edu.web.persistence.BoardDaoImpl;
import edu.web.persistence.UserDao;
import edu.web.persistence.UserDaoImpl;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private BoardDao boardDao;
	
	private static UserServiceImpl instance = null;
	
	private UserServiceImpl() {
		userDao = UserDaoImpl.getInstance();
			
	} 
	
	public static UserServiceImpl getInstance() {
		if (instance == null) {
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	@Override
	public List<User> select() {
		System.out.println("userServiceImple.select() 메서드호출");
		return userDao.read();
	}

	@Override
	public int registerNewUser(User user) {
		System.out.println("userServiceImpl.registerNewUser(user) 메서드");
		int result = 0;
		
		result = userDao.create(user);
		
		return result;
	}

	@Override
	public User select(String userId) {
		System.out.println("userServiceImpl.select(userId=" + userId + ") 메서드 호출");
		
		User user = userDao.read(userId); // 아이디로 검색
		
		return user;
	}



}
