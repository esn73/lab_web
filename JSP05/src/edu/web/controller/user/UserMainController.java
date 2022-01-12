package edu.web.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.web.controller.Action;

// board/main 요청 주소를 처리할 Controller 클래스
public class UserMainController implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 게시글 전체 목록을 검색할 결과를 View(JSP)에 전달.
		
		return "/WEB-INF/user/user-main.jsp";
	}

}
	