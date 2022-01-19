package edu.web.jsp07.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
@WebServlet(urlPatterns = { "/add-cookie" }, name = "addCookieServlet")
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("addCookieServlet.doget() 호출");
		
		//TODO
		
		//Servlet에서 View(JSP)로 포워드 이동
		request.getRequestDispatcher("/WEB-INF/01_cookie_result.jsp").forward(request, response);
	}

}
