package kr.co.devcs.board.service.post;

import kr.co.devcs.board.service.domain.Post;

public interface PostDao {

	Post getPost(int postNo);

	public void addPost(Post post) throws Exception;

}
