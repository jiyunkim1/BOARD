package org.jiyunkim1.dto;

public class LoginDTO {
	
	private String userId;
	private String userpw;
	private boolean useCookie;
	
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
	
	public boolean isUseCookie() {
		return useCookie;
	}
	
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [userId=" + userId + ", userpw=" + userpw + ", useCookie="
				+ useCookie + "]";
	}

}
