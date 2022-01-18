package edu.web.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.web.controller.Action;
import edu.web.domain.User;
import edu.web.service.UserService;
import edu.web.service.UserServiceImpl;

public class UserDetailController implements Action{
	
	private UserService userdService = UserServiceImpl.getInstance();

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("userDetailController.execute() 메서드 호출");
		// TODO 아이디를 클릭했을 때 해당 아이디(userId)의 모든 내용을 보여주는 페이지
		// 1. request 객체에서 요청 파라미터 userId의 값을 읽음.
		String userId = request.getParameter("userId");	
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		// 2. boardService 객체의 메서드를 호출해서 게시글 내용을 가져옴.
		User user = userdService.select(userId);
		
		// 3. request 객체에 User 객체를 포함시켜서 View(JSP)로 포워드.
		request.setAttribute("user", user);
		
		return "/WEB-INF/user/user-detail.jsp";
	}

}