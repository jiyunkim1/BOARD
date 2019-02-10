package org.jiyunkim1.domain;

import java.util.Date;

public class PostVO {
	
	private Integer postId;
	private String postTitle;
	private String userId;
	private Date postDate;
	private String postContent;
	private int viewcnt;
	private Integer repGroup;
	private Integer repOrder;
	private Integer repIndent;
	
	
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public Integer getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	public Integer getRepGroup() {
		return repGroup;
	}
	public void setRepGroup(Integer repGroup) {
		this.repGroup = repGroup;
	}
	public int getRepOrder() {
		return repOrder;
	}
	public void setRepOrder(Integer repOrder) {
		this.repOrder = repOrder;
	}
	public int getRepIndent() {
		return repIndent;
	}
	public void setRepIndent(Integer repIndent) {
		this.repIndent = repIndent;
	}
	
	@Override
	public String toString() {
		return "PostVO [postId=" + postId + ", title=" + postTitle + ",content="
				+postContent + ", writer=" + userId + ", date=" + postDate + ", viewcount=" + viewcnt + "]";
	}

}
