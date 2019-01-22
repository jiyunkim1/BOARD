package org.jiyunkim1.service;

import java.util.List;

import org.jiyunkim1.domain.Criteria;
import org.jiyunkim1.domain.PostVO;

public interface PostService {
	
	public void register(PostVO post)throws Exception;
	
	public PostVO read(Integer postId)throws Exception;
	
	public void modify(PostVO post)throws Exception;
	
	public abstract void remove(Integer postId)throws Exception;
	
	public List<PostVO> listAll() throws Exception;
	
	public List<PostVO> listCriteria(Criteria cri)throws Exception;
	
	public int listCountCriteria(Criteria cri)throws Exception;
}
