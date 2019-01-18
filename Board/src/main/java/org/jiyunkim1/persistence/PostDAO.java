package org.jiyunkim1.persistence;

import java.util.List;

import org.jiyunkim1.domain.PostVO;

public interface PostDAO {
	
	public void create(PostVO vo)throws Exception;
	
	public PostVO read(Integer postId)throws Exception;
	
	public void update(PostVO vo)throws Exception;
	
	public void delete(Integer postId)throws Exception;
	
	public List<PostVO> listAll()throws Exception;

}
