package org.jiyunkim1.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import org.jiyunkim1.domain.UserVO;
import org.jiyunkim1.dto.LoginDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.jiyunkim1.mapper.userMapper";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception{
		
		return session.selectOne(namespace + ".login", dto);
	}
	
	@Override
	public void createUser(UserVO user) throws Exception{
		
		session.insert(namespace+".createUser", user);
	}

}
