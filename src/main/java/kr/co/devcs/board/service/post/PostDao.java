package kr.co.devcs.board.service.post;

import kr.co.devcs.board.service.domain.Post;

public interface PostDao {

	Post getPost(int postNo);

<<<<<<< Updated upstream
	public void addPost(Post post) throws Exception;
=======
	public List<Post> getPostList()throws Exception;
>>>>>>> Stashed changes

}
