package org.jiyunkim1.domain;

public class UserVO {
	
	private String userId;
	private String userpw;
	private String username;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserpw() {
		return userpw;
	}
	
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userpw=" + userpw + ", username=" + username + "]";
	}

}
