package org.jiyunkim1.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
	
	@Override
	public void keepLogin(String userId, String sessionId, Date next) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", userId);
		paramMap.put("sessionId", sessionId);
		paramMap.put("next", next);
		
		session.update(namespace+" .keepLogin", paramMap);
	}
	
	@Override
	public UserVO checkUserWithSessionKey(String value) {
		
		return session.selectOne(namespace+ ".checkUserWithSessionKey", value);
	}

}
