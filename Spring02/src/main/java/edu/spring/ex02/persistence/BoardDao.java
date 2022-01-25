package edu.spring.ex02.persistence;

import java.util.List;

import edu.spring.ex02.domain.Board;

// CRUD(Create, Read, Update, Delete)
public interface BoardDao {

	public List<Board> read();
	Board read(int bno);
	int create(Board board); // board.getTitle(), board.getContent(), board.getUserid()
	//과제
}