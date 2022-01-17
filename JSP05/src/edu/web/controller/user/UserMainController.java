package edu.web.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.web.controller.Action;
import edu.web.domain.Board;
import edu.web.domain.User;
import edu.web.service.UserService;
import edu.web.service.UserServiceImpl;

// user/main 요청 주소를 처리할 Controller 클래스
public class UserMainController implements Action{

	UserService userService =  UserServiceImpl.getInstance();
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 게시글 전체 목록을 검색할 결과를 View(JSP)에 전달.
		
		List<User> user = userService.select();
		
		request.setAttribute("User", user);
		
		return "/WEB-INF/user/user-main.jsp";
	}
	// 서비스 계층의 메서드를 호출해서 게시글 전체 목록을 검색.

}
	