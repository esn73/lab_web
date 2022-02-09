package edu.spring.ex02.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.ex02.domain.Reply;
import edu.spring.ex02.persistence.ReplyDao;

@Service
public class ReplyServiceImpl implements ReplyService {

	private static final Logger log = LoggerFactory.getLogger(ReplyServiceImpl.class);
	
	@Autowired
	private  ReplyDao replyDao;
	
	@Override
	public List<Reply> select(int bno) {
		log.info("select(bno={})", bno);
		
		return replyDao.read(bno);
	}

	@Override
	public int insert(Reply reply) {
		// 댓글 테이블(replies)에 새로운 댓글 추가
		int result= replyDao.create(reply);
		
		// 게시판 테이블(boards)에 댓글수를 업데이트
		
		// 댓글을 작성한 사용자에게 포인트를 지급
		
		return result;
	}

}