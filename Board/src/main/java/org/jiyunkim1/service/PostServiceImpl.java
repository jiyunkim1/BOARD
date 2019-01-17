package org.jiyunkim1.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.persistence.PostDAO;

@Service
public class PostServiceImpl implements PostService{
	
	@Inject
	private PostDAO dao;
	
	@Override
	public void register(PostVO post) throws Exception {
		dao.create(post);
	}
	
	public PostVO read(Integer postId) throws Exception {
		return dao.read(postId);
	}
	
	public void modify(PostVO post) throws Exception {
		dao.update(post);
	}
	
	@Override
	public void remove(Integer postId) throws Exception {
		dao.delete(postId);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception {
		return dao.listAll();
	}

}