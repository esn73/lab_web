package edu.web.persistence;

import java.util.List;

import edu.web.domain.Board;

public class BoardDaoImpl implements BoardDao {
	
	// Singleton 패턴 적용 

	@Override
	public List<Board> read() {
		// TODO DataSource에서 connection을 가져와서 SELECT 문장을 실행하고 결과를 리턴.
		return null;
	}

}
