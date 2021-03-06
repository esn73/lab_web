package edu.web.domain;

public class User {
	// DB 테이블 이름, 컬럼 이름들을 상수로 정의하는 내부 클래스
	public static abstract class Entry{
		public static final String TABLE_USER = "USERS"; 	// 테이블 이름
		public static final String COL_USERID = "USERID"; 	// 사용자 아이디(primary key)
		public static final String COL_PWD = "PWD"; 		// 로그인 비밀번호
		public static final String COL_EMAIL = "EMAIL" ; 	// 사용자 이메일 정보
		public static final String COL_POINTS = "POINTS" ; 	// 글/댓글 작성했을 때 지급하는 포인트 정보
		
	}
	
	// 멤버 변수, 필드(field), 프로퍼티(property)
	private String userId;
	private String pwd;
	private String email;
	private int points;

	
	// 생성자(constructor)
	public User() {}
	
	public User(String userId, String pwd, String email) {
		super();
		this.userId = userId;
		this.pwd = pwd;
		this.email = email;
	}
	
	
	public User(String userId, String pwd, String email, int points) {
		super();
		this.userId = userId;
		this.pwd = pwd;
		this.email = email;
		this.points = points;
	}

	// getters $ setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	


	
}
