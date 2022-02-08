package edu.spring.ex02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.spring.ex02.domain.Reply;

@RestController // REST 서비스를 지원하는 컨트롤러
// RestController 클래스의 모든 메서드들이 리턴하는 값은 view(JSP)를 찾기 위한 문자열이 아니라 
// 응답(response)으로 클라이언트에게 전달되는 데이터 
@RequestMapping(value="/replies")
public class ReplyRestController {
	
	private static final Logger log = LoggerFactory.getLogger(ReplyRestController.class);
	
	@RequestMapping(value = "/all/{bno}", method = RequestMethod.GET)
	public ResponseEntity<List<Reply>> readAllReplies(@PathVariable(name="bno") Integer bno) {
		log.info("readAllReplies(bno={})", bno);
		
		return null;
	}
}
