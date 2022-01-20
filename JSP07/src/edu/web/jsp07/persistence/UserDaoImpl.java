package edu.web.jsp07.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.web.jsp07.model.User;

import static edu.web.jsp07.model.User.Entry.*;

public class UserDaoImpl implements UserDao {
	
	private DataSource ds;
	
	private static UserDaoImpl instance = null;
	
	private UserDaoImpl() {
		try {
			Context initContext = new InitialContext(); // 전에는 utill로 클래스를 만들어서 가져옴
			Context envContext = (Context) initContext.lookup("java:comp/env");
			ds = (DataSource) envContext.lookup("jdbc/myoracle");
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static UserDaoImpl getInstance() {
		if (instance == null) {
			instance = new UserDaoImpl();
		}
		return instance;
	} 

	@Override
	public User checkSignIn(String id, String pw) {
		// argument로 전달받은 아이디/비밀번호와 일치하는 사용자 계정이 있는지 체크.
		// 일치하는 계정이 있으면 User 객체를 리턴. 일치하는 계정이 없으면 null을 리턴.
		
		System.out.println("userDaoImpl.checkSignIm(id =" + id + ", pw=" + pw + ") 호출");
		
		User user = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 실행한 sql문장 만듦
		ResultSet rs = null; // 실행
		try {
			conn = ds.getConnection();

			
			pstmt = conn.prepareStatement(SQL_CHECK_SIGNIN);
			System.out.println(pstmt);
			System.out.println(SQL_CHECK_SIGNIN);
			
			pstmt.setString(1, id); // 1 첫번째 물음표
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery(); //sql -executeQuery 리턴타입 int
			if(rs.next()) { // next 아이디/패스워드가 일치하는 레코드 다음 행이 있으면 , 없으면 null을 리턴
				String userId = rs.getString(COL_USERID);
				String pwd = rs.getString(COL_PWD);
				String email = rs.getString(COL_EMAIL);
				int points = rs.getInt(COL_POINTS);
				user = new User(userId, pwd, email, points);
				
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return user;
	}
	
	
}
