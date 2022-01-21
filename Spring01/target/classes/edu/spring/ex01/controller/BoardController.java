package edu.spring.ex01.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class BoardController { 
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
//	@RequestMapping (value = "/board/main", method = RequestMethod.GET)
	@RequestMapping (value = "/main", method = RequestMethod.GET)
	public void boardMain() {
		logger.info("boardMain() 호출");
	}
	
//	@RequestMapping (value = "/board/insert", method = RequestMethod.GET)
	@RequestMapping (value = "/insert", method = RequestMethod.GET)
	public void boardInsert() {
		logger.info("boardInsert() 호출");
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String boardInsertPost(int bno, String title) {
//	public String boardInsertPost(HttpServletRequest req) {
//		int bno = Integer.parseInt(req.getParameter("bno"));
//		String title = req.getParameter("title");
		
		logger.info("board/insertPost() 호출: bno = {}, title = {}", bno, title);
		
		return "insert-result"; // WEB-INF/views/insert-result.jsp
	}
	
}
