package org.jiyunkim1.persistence;

import java.util.List;

import org.jiyunkim1.domain.PostVO;

public interface PostDAO {
	
	public abstract void create(PostVO vo)throws Exception;
	
	public abstract PostVO read(Integer postId)throws Exception;
	
	public abstract void update(PostVO vo)throws Exception;
	
	public abstract void delete(Integer postId)throws Exception;
	
	public abstract List<PostVO> listAll()throws Exception;

}
