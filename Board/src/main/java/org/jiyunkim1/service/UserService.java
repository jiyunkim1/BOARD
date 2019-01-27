package org.jiyunkim1.service;

import javax.servlet.http.HttpSession;

import org.jiyunkim1.domain.UserVO;
import org.jiyunkim1.dto.LoginDTO;

public interface UserService {
	
	public abstract UserVO login(LoginDTO dto) throws Exception;
	
	public abstract void signup(UserVO vo) throws Exception;
	
	//public abstract void logout(HttpSession session);

}
