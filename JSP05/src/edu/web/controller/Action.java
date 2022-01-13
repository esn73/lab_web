package edu.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action { // interface는 추상메서드만 가짐
	
	String REDIRECT_PREFIX = "redirect:";
	
	String execute(HttpServletRequest request, HttpServletResponse response );
}
