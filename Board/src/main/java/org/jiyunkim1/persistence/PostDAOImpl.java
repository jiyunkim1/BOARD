package org.jiyunkim1.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.jiyunkim1.domain.PostVO;

@Repository
public class PostDAOImpl implements PostDAO{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace= "org.jiyunkim1.mapper.postMapper";
	
	@Override
	public void create(PostVO vo) {
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public PostVO read(Integer postId) {
		return session.selectOne(namespace+".read", postId);
	}
	
	@Override
	public void update(PostVO vo) {
		session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(Integer postId) {
		session.delete(namespace+".delete", postId);
	}
	
	@Override
	public List<PostVO> listAll() {
		return session.selectList(namespace+".listAll");
	}
	
	
}
