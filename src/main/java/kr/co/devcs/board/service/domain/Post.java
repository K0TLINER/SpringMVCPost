package kr.co.devcs.board.service.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Post {
	
	private int postNo;
	private String postTitle;
	private String postContent;
	private Timestamp regDate; 
	
	public Post() {
		this.postTitle = postTitle;
		this.postNo = postNo;
		this.postContent = postContent;
		this.regDate = regDate;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Post [postNo=" + postNo + ", postTitle=" + postTitle + ", postContent=" + postContent + ", regDate="
				+ regDate + "]";
	}


	
}
