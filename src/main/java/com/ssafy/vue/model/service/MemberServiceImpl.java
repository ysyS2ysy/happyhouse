package com.ssafy.vue.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.vue.model.MemberDto;
import com.ssafy.vue.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void registerUser(MemberDto memberDto) throws Exception {
		sqlSession.getMapper(MemberMapper.class).registerUser(memberDto);
	}
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return sqlSession.getMapper(MemberMapper.class).login(memberDto);
	}

	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).userInfo(userid);
	}

	@Override
	public int checkId(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).checkId(userid);
	}
	
	@Override
	@Transactional
	public boolean modifyUser(MemberDto memberDto) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).modifyUser(memberDto) == 1;
	}

	@Override
	@Transactional
	public boolean deleteUser(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).deleteUser(userid) == 1;
	}

}
