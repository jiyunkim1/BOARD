package org.jiyunkim1.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.jiyunkim1.domain.Criteria;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.domain.SearchCriteria;

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
	public void updateGroup(PostVO vo) {
		session.update(namespace+".updateGroup", vo);
	}
	
	@Override
	public void reply(PostVO vo) {
		session.insert(namespace+".reply", vo);
	}
	
	public void updateReplyGroup(PostVO vo) {
		session.update(namespace+".updateReply", vo);
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
	
	@Override
	public List<PostVO> listPage(int page) throws Exception {
		if (page <=0) {
			page=1;
		}
		
		page = (page-1) * 10;
		return session.selectList(namespace + ".listPage", page);
	}
	
	@Override
	public List<PostVO> listCriteria(Criteria cri) throws Exception{
		
		return session.selectList(namespace+".listCriteria", cri);
	}
	
	@Override
	public Integer countPaging(Criteria cri) throws Exception {
		
		return session.selectOne(namespace+".countPaging", cri);
	}
	
	
	@Override
	public void updateViewCnt(Integer postId) throws Exception {
		session.update(namespace+".updateViewCnt", postId);
	}
	
	@Override
	public List<PostVO> listSearch(SearchCriteria cri) throws Exception{
		
		return session.selectList(namespace + ".listSearch", cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception{
		
		return session.selectOne(namespace + ".listSearchCount", cri);
	}
}
