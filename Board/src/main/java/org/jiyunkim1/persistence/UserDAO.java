package org.jiyunkim1.persistence;

import java.util.Date;

import org.jiyunkim1.domain.UserVO;
import org.jiyunkim1.dto.LoginDTO;

public interface UserDAO {
	
	public UserVO login(LoginDTO dto)throws Exception;
	
	public void createUser(UserVO user)throws Exception;
	
	public abstract void keepLogin(String userId, String sessionId, Date next);
	
	public UserVO checkUserWithSessionKey(String value);

}
