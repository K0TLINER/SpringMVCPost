package kr.co.devcs.board.service.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Comment {
	
	private int commentNo;
	private int postNo;
	private String commentContent;
	private Timestamp regDate;
	
	public Comment() {

	}
	
	public int getCommentNo() {
		return commentNo;
	}
	
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		System.out.println("¿©±â?");
		this.postNo = postNo;
	}
	public void setPostNo(String postNo) {
		System.out.println("µé¾î¿È");
		this.postNo = Integer.parseInt(postNo);
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContext(String commentContent) {
		this.commentContent = commentContent;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}


	public String toString() {
		return "Comment [commentNo=" + commentNo + ", postNo=" + postNo + ", commentContent=" + commentContent
				+ ", regDate=" + regDate + "]";
	}
	
	
	

	
}
