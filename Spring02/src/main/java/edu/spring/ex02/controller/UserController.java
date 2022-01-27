package edu.spring.ex02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.spring.ex02.domain.User;
import edu.spring.ex02.service.UserService;



@Controller // servlet-context.xml의 <context:component-scan>에서 java baen으로 관리.
@RequestMapping(value = "/user")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired private UserService userService;
	
	@RequestMapping(value="/register", method = RequestMethod.GET) //get방식은 파라미터가 필요없음
	public void register() {
		log.info("register() GET 호출");
	}
	
	@RequestMapping (value="/register", method = RequestMethod.POST)
	public String register(User user) {
		log.info("register({}) POST 호출", user);
		
		userService.registerNewUser(user);
		
		return "redirect:/"; // http://localhost:8181/ex02/ 로 redirect
	}
	
	@RequestMapping(value="/checkid", method = RequestMethod.POST)
	@ResponseBody
	// controller 메서드가 리턴하는 문자열이 jsp파일 경로 이거나 혹은 페이지 이동(forward, redirect) 주소가 아니라, 
	// 클라이언트로 전송되는 응답(response) 문자열임을 선언하는 어노테이션.
	
	public String checkUserId(String userid) {
		log.info("checkUserId(userid={})", userid);
		
		if (userService.isValidId(userid)) {
			return "valid";
		} else {
			return "invalid";
		}
	}
		
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public void signIn() {
		log.info("signIn() GET 호출");
		
	}
	
}
