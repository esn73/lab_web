package edu.web.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.web.controller.Action;
import edu.web.domain.User;
import edu.web.service.UserService;
import edu.web.service.UserServiceImpl;

public class UserInsertController implements Action {
	
	private UserService userService = UserServiceImpl.getInstance();

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String method = request.getMethod();
		if(method.equals("GET")) {
			return doGet(request, response);
		} else {
			return doPost(request, response);
		}
		
		
	}

	private String doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserInsertController.doPost() 메서드 호출");
		
		String userId = request.getParameter("userId");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");

		User user = new User(userId, pwd, email, 0);
		userService.registerNewUser(user);
		
		return REDIRECT_PREFIX + "main";
	}

	private String doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserInsertController.doGet() 메서드 호출");
		return "/WEB-INF/user/user-insert.jsp";
	}

}
