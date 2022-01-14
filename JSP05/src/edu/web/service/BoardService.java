package edu.web.service;

import java.util.List;

import edu.web.domain.Board;

public interface BoardService {

	/**
	 * Persistence 계층(BoadDao)의 read 메서드를 호출해서 게시글 전체 목록을 반환하는 메서드.
	 * 
	 * @return Board를 원소로 갖는 ArrayList.
	 */
	
	List<Board> select();

	/**
	 * 새 글 작성 서비스:
	 * (1) Boards 테이블에 새 글 insert
	 * (2) User 테이블에서 글을 작성한 userid poits를 10점 증가
	 * 
	 * @param board DB boards 테이블에 insert할 title, content, userid를 가지고 있는 객체.
	 * @return 성공하면 1, 실패하면 0.
	 */
	int registerNewBoard(Board board);
}
