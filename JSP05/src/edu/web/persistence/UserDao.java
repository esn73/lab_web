package edu.web.persistence;

import static edu.web.domain.Board.Entry.COL_BNO;
import static edu.web.domain.Board.Entry.TABLE_BOARD;
import static edu.web.domain.User.Entry.*;

import java.util.List;

import javax.swing.text.TabableView;

import edu.web.domain.User;

public interface UserDao {

	//전체 검색
	String SQL_SELECT_ALL = String.format(
			"select * from %s", 
			TABLE_USER);
	
	
	// user 테이블의 points 업데이트
	// update USERS set POINTS = POINTS + ? where USERID = ?;
	String SQL_UPDATE_USER_POINTS = String.format(
			"update %s set %s = %s + ? where %s = ?", 
			TABLE_USER, COL_POINTS, COL_POINTS, COL_USERID);
	/**
	 * DB users 테이블에서 userId의 points 컬럼 값을 증가. 
	 * 
	 * @param points 증가시킬 값.
	 * @param userId 수정할 userid(테이블의 고유키)
	 * @return
	 */
	
	
	List<User> read();
	
	//insert into user (userid, pwd, email)사용자 등록
	String SQL_INSERT_USER = String.format(
			"insert into %s (%s, %s, %s) values (?, ?, ?)",
			TABLE_USER, COL_USERID, COL_PWD, COL_EMAIL);
	
	int create(User user);
	
	//사용자 상세 보기 : select * from USER where userId =?;
	String SQL_SELECT_BY_USERID = String.format(
			"select * from %s where %s = ?",
			TABLE_USER, COL_USERID);
	
	User read(String userId);
	
	
	int update(int points, String userId); //updateUserPoints
}
