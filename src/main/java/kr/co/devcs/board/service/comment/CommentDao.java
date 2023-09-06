package kr.co.devcs.board.service.comment;

import java.util.List;
import java.util.Map;

import kr.co.devcs.board.service.domain.Comment;

public interface CommentDao {

	public int addComment(Map<String, Object> commentMap);

	public List<Comment> getCommentList(int postNo);


}
