package org.jiyunkim1.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.jiyunkim1.domain.Criteria;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.domain.SearchCriteria;
import org.jiyunkim1.persistence.PostDAO;

@Service
public class PostServiceImpl implements PostService{
	
	@Inject
	private PostDAO dao;
	
	@Override
	public void register(PostVO post) throws Exception {
		dao.create(post);
		dao.updateGroup(post);
	}
	
	@Override
	public void reply(PostVO post) throws Exception{
		dao.updateReplyGroup(post);
		dao.reply(post);	
	}
	
	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public PostVO read(Integer postId) throws Exception {
		dao.updateViewCnt(postId);
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
	
	@Override
	public List<PostVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}
	
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
	
	@Override
	public List<PostVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		
		return dao.listSearch(cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception{
		
		return dao.listSearchCount(cri);
	}

}
