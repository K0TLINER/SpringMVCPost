package kr.co.devcs.board.service.comment.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.devcs.board.service.comment.CommentDao;
import kr.co.devcs.board.service.domain.Comment;

@Repository("commentDaoImpl")
public class CommentDaoImpl implements CommentDao {

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int addComment(Map<String,Object> commentMap) {
		System.out.println(commentMap);
		return sqlSession.insert("CommentMapper.addComment",commentMap);		
	}


	public List<Comment> getCommentList(int postNo) {
		
		return sqlSession.selectList("CommentMapper.getCommentList",postNo);
	}
}
