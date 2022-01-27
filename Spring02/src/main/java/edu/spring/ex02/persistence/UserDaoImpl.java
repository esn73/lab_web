package edu.spring.ex02.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.spring.ex02.domain.User;
import edu.spring.ex02.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	
	// 스프링 컨테이너가 생성하고 관리하는 mapper 갟체를 주입(injection) 받음.
	@Autowired private UserMapper mapper; 
	
	@Override
	public int create(User user) {
		log.info("create({}) 호출", user);
		
		return mapper.insert(user);
	}
}
