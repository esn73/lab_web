package edu.spring.ex02.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.spring.ex02.domain.User;

@Mapper // 스프링 컨테이너에서 컴포넌트 객체(java bean)로 생성해서 관리하도록.
public interface UserMapper {

	String SIGN_UP = 
			"INSERT INTO ${TABLE_USERS} (${COL_USERID}, ${COL_PWD}, ${COL_EMAIL}) " // 끝에 공백 반드시 포함 -my batis
			+ "VALUES (#{userid}, #{pwd}, #{email})"; // getter ? ? ?
	
	@Insert(SIGN_UP) // mybatis가 해줌
	int insert(User user);
}
