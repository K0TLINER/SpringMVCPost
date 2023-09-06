package kr.co.devcs.board.service.post.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.devcs.board.service.domain.Post;
import kr.co.devcs.board.service.post.PostDao;

@Repository("postDaoImpl")
public class PostDaoImpl implements PostDao{
	
	@Autowired 
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Post getPost(int postNo) {
		return sqlSession.selectOne("PostMapper.getPost",postNo);
	}

	public void addPost(Post post) throws Exception {
		System.out.println("add Post DaoImpl 시작 .... ");
		System.out.println(post.toString());
		sqlSession.insert("PostMapper.addPost", post);

	}

}
