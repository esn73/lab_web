package edu.spring.ex02.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.ex02.domain.User;
import edu.spring.ex02.persistence.UserDao;

@Service // ***Service 컴포넌트 선언 -> root-context.xml에서 설정에 의해서 bean(자바객체)을 관리됨.
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	// repository(persistence) 계층의 객체 사용 -> 의존성 주입
	@Autowired private UserDao userDao;
	
	@Override
	public int registerNewUser(User user) {
		log.info("registerNewUser() 호출" , user);
		
		return userDao.create(user);
	}

}
