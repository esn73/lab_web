package edu.spring.ex01.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.filter.CharacterEncodingFilter.*;
		

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
	public String boardInsertPost(int bno, String title, Model model) {
//	public String boardInsertPost(HttpServletRequest req) {
//		int bno = Integer.parseInt(req.getParameter("bno"));
//		String title = req.getParameter("title");
// Controller 메서드에서 파라미터 이름을 요청 파라미터(form 요소들의 name 속성) 이름과 동일하게 작성하면 
// Dispatcher Servlet이 요청 파라미터들을 분석해서(request.getParameter() 호출해서)
// 메서드를 호출할 때 argument로 전달해줌.
		
		logger.info("board/insertPost() 호출: bno = {}, title = {}", bno, title);
		
		// JSP에게 데이터를 전달할 때, Model 객체에 속성(attr)을 추가. -> 지역변수로 모델을 import하는게 아니고 파라미터에 적용
		model.addAttribute("bno", bno);
		model.addAttribute("title", title);
		
		return "insert-result"; // WEB-INF/views/insert-result.jsp
	}
	
	@RequestMapping(value = "/insert2", method = RequestMethod.GET)
	public void boardInsert2() {
		logger.info("boardInsert2() 호출");
	}
	
	@RequestMapping(value = "/insert2", method = RequestMethod.POST)
	public String boardInsert2(
		@RequestParam(value = "board-no") int bno, 
		@RequestParam(value = "board-title") String title,
		Model model) { // 위에 파라미터가 달라서 오버로딩 		
		// controller 클래스의 메서드의 파라미터에서 사용하는 @RequestParam 어노테이션:
		// 요청 파라미터의 값을 Dispatcher Servlet이 분석해서, 파라미터에 전달할 때 사용.
		// 주로 메서드 파라미터의 이름과 요청 파라미터 name 속성 값이 다른 경우에 사용.
		
		logger.info("boardInsert2(bno = {}, title={})", bno, title);
		
		model.addAttribute("bno", bno);
		model.addAttribute("title", title);
		
		return "board/insert-result";
	}
	
}
