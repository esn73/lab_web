package edu.spring.ex02;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.ex02.domain.Board;
import edu.spring.ex02.domain.User;
import edu.spring.ex02.persistence.BoardDao;
import edu.spring.ex02.persistence.UserDao;
import edu.spring.ex02.persistence.UserDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
		)

@WebAppConfiguration //POJO
public class BoardDoaTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardDoaTest.class);
	
	@Autowired private BoardDao boardDao;
	@Autowired private UserDao userDao;
	
	@Test
	public void doTest() {
//		logger.info("boardDao: {}", boardDao);
//		List<Board> list = boardDao.read();
//		logger.info("list size = {}", list.size());

//		Board board = boardDao.read(1);
//		logger.info(board.toString());
//		
//		Board board = new Board(0, "myBatis-Spring test", "마이바티스 스프링 테스트", "admin", null, 0, 0, null);
//		int result = boardDao.create(board);
//		logger.info("INSERT 결과: {}", result);
//		
//		Board board = new Board(2, "수정성공?", "MyBatis를 사용한 SQL UPDATE", null, null, 0, 0, null);
//		int result = boardDao.update(board);
//		logger.info("UPDATE 결과: {}", result);
	
//		int result = boardDao.updateViewCnt(1);
//		logger.info("updateViewCnt 결과: {}", result);
		
//		int result = boardDao.delete(22);
//		logger.info("updateViewCnt 결과: {}", result);
		
//		List<Board> list = boardDao.read(3, "TEST");
//		logger.info("키워드 검색 결과: {}개 행", list.size());
		
		User user= new User("ti", "0000", "oh_ssam@itiwill.co.kr", 0);
		int result = userDao.create(user);
		logger.info("create user 결과: {}", result);
	}
	
}
