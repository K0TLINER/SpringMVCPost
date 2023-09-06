package kr.co.devcs.board.service.post.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.co.devcs.board.service.domain.Post;
import kr.co.devcs.board.service.post.PostDao;
import kr.co.devcs.board.service.post.PostService;

@Service("postServiceImpl")
public class PostServiceImpl implements PostService{
	
	@Autowired
	@Qualifier("postDaoImpl")
	private PostDao postDao;

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	public Post getPost(int postNo) {
		System.out.println(postNo);
		return postDao.getPost(postNo);
	}

	public void addPost(Post post) throws Exception {
		System.out.println("add Post ServiceImpl 시작 .... ");
		postDao.addPost(post);
	}
}
