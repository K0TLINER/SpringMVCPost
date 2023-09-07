package kr.co.devcs.board.service.post;

import kr.co.devcs.board.service.domain.Post;

public interface PostService {

	public void addPost(Post post) throws Exception;

	public Post getPost(int postNo);

	public List<Post> getPostList()throws Exception;

}
