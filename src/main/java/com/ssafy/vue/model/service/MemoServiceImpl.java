package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.MemoDto;
import com.ssafy.vue.model.mapper.MemoMapper;

@Service
public class MemoServiceImpl implements MemoService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MemoDto> getMemoList(int articleno) throws Exception {
		List<MemoDto> temp = sqlSession.getMapper(MemoMapper.class).getMemoList(articleno);
		System.out.println("memo list size : "+temp.size());
		System.out.println("memo list content : " + temp.get(0).getComment());
		return sqlSession.getMapper(MemoMapper.class).getMemoList(articleno);
	}

	@Override
	public boolean writeMemo(MemoDto memoDto) throws Exception {
		if(memoDto.getComment() == null || memoDto.getUserid() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(MemoMapper.class).writeMemo(memoDto) == 1;
	}

	@Override
	public boolean modifyMemo(MemoDto memoDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteMemo(int memono) throws Exception {
		sqlSession.getMapper(MemoMapper.class).deleteMemo(memono);
	}

	@Override
	public void addRecommend(MemoDto memoDto) throws Exception {
		sqlSession.getMapper(MemoMapper.class).addRecommend(memoDto);
	}

}
