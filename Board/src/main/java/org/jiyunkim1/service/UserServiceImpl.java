package org.jiyunkim1.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.jiyunkim1.domain.UserVO;
import org.jiyunkim1.dto.LoginDTO;
import org.jiyunkim1.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	private UserDAO dao;
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception{
		
		return dao.login(dto);
	}
	
	@Override
	public void signup(UserVO vo) throws Exception{
		
		dao.createUser(vo);
	}

	
	/*
	public void logout(HttpSession session) {
		
		session.invalidate();
	}
	*/

}
