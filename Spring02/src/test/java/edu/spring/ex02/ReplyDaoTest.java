package edu.spring.ex02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.ex02.domain.Reply;
import edu.spring.ex02.persistence.ReplyDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
)
@WebAppConfiguration
public class ReplyDaoTest {

	private static final Logger log = LoggerFactory.getLogger(ReplyDaoTest.class);
	
	@Autowired
	private ReplyDao replyDao;
	
	@Test
	public void doTest() {
		log.info("replyDao: {}", replyDao);
		
		Reply reply = new Reply(0, "DAO 테스트", "admin", null, 1);
		int result = replyDao.create(reply);
		log.info("insert result:{}", result);
	}
	
}
