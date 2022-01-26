package edu.spring.ex02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//디스패쳐서블릿
@Controller
@RequestMapping(value = "/board")
public class BoardController {
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void main() {
		log.info("main() 호출");
	}
}
