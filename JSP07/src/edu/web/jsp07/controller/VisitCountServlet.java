package edu.web.jsp07.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitCountServlet
 */
@WebServlet(name = "visitCountServlet", urlPatterns = { "/visit-count" })
public class VisitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int count = 0; // 방문 횟수 카운트 0으로 초기화
		
		// 브라우저가 보낸 쿠키들을 확인
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c :cookies) {
				String cookieName = c.getName();
				if (cookieName.equals("visitCount")) {
					count = Integer.parseInt(c.getValue()) + 1;
					break;
				}
			}
		}
		
		// 서버에서 브라우저로 VisitCount 이름을 갖는 쿠키를 생성해서 보냄.
		Cookie cookie = new Cookie("visitCount", String.valueOf(count)); // "" + count 처음으로 쿠키가 생성 0이라는 문자 생성후
		response.addCookie(cookie); // 클라이언트에 보내줌
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("<html><body>")
			.append("<h1> 방문횟수: " + count + "</h1>")
			.append("</body></html>");
		
	}

}
