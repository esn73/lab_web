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
import edu.spring.ex02.persistence.BoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
		)

@WebAppConfiguration
public class BoardDoaTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardDoaTest.class);
	
	@Autowired private BoardDao boardDao;
	
	@Test
	public void doTest() {
		logger.info("boardDao: {}", boardDao);
		List<Board> list = boardDao.read();
		logger.info("list size = {}", list.size());
	}
	
}
