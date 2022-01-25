package edu.spring.ex02;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.ex02.domain.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
)

@WebAppConfiguration
public class DataSourceTest {
	private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);

	// **@Autowired, @Inject: 의존성 주입(dependency injection), 제어의 역전(IoC: Inversion of Control)
	// 스프링 프레임 워크가 생성한 자바 객체(Java bean)을 변수에 할당해 줌.
	// DataSourcTest 클래스는 객체를 주입받음. 
	// 객체 생성, 관리의 주체가 객체를 사용하는 클래스에서 프레임워크로 바뀜.
	// -> 소스 코드의 재활용성이 높아짐. 소스 코드의 수정을 최소화.
	@Autowired private DataSource ds; 
	@Autowired private SqlSessionFactory sessionFactory;
	@Autowired private SqlSession sqlSession;
	
	@Test 
	public void doTest() {
		logger.info("ds: {}", ds); // -> ds != null: Java bean을 스프링 프레임워크에서 주입 받음. 
		logger.info("sessionFactory: {}", sessionFactory );																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
		logger.info("sqlSession: {}", sqlSession);
		
		List<Board> list =  sqlSession.selectList("edu.spring.ex02.mapper.BoardMapper.selectAll"); 
		for (Board b : list) {
			logger.info(b.toString());
		}
	}
		
}
