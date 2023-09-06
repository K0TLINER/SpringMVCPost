package kr.co.devcs.board.service.comment.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.co.devcs.board.service.comment.CommentDao;
import kr.co.devcs.board.service.comment.CommentService;
import kr.co.devcs.board.service.domain.Comment;

@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService{

	@Autowired
	@Qualifier("commentDaoImpl")
	private CommentDao commentDao;
	
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	
	public int addComment(Map<String,Object> commentMap) {
		return commentDao.addComment(commentMap);		
	}


	
	public List<Comment> getCommentList(int postNo) {
		List<Comment> list = commentDao.getCommentList(postNo);
		
		return list;
	}
	
}
