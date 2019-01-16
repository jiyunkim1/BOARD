package org.jiyunkim1.service;

import java.util.List;
import org.jiyunkim1.domain.PostVO;

public interface PostService {
	
	public abstract void register(PostVO post)throws Exception;
	
	public abstract PostVO read(Integer postId)throws Exception;
	
	public abstract void modify(PostVO post)throws Exception;
	
	public abstract void remove(Integer postId)throws Exception;
	
	public abstract List<PostVO> listAll() throws Exception;
}
