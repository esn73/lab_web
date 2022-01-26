package edu.spring.ex02.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.ex02.domain.Board;
//보드컨트롤러에서 게시글 전체를 읽어오기 위해 생성한 서비스 
import edu.spring.ex02.persistence.BoardDao;

@Service // 스프링 컨테이너(프레임워크)가 서비스 컴포넌트로 생성하고 관리하기 위해서.
public class BoardServiceImpl implements BoardService{
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	// Service 계층은 Persistence(Repository)계층의 객체를 사용.
	
	@Autowired // 싱글턴으로 만들고 싱글턴메서드 호출할 필요가 없음.
	private BoardDao boardDao;	

	@Override
	public List<Board> select() {
		log.info("select() 호출");
		
		return boardDao.read();
	}

	@Override
	public int insert(Board board) {
		log.info("insert({}) 호출", board);
		
		// (1) boards 테이블에 새 글 insert
		int result = boardDao.create(board);
		// (2) TODO: 글을 작성한 사용자의 points를 10점 증가.
		
		return result;
	}

	@Override
	public Board select(int bno) {
		log.info("select(bno={}");
		
		return boardDao.read(bno);
	}

}
