package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.HouseDealDto;
import com.ssafy.vue.model.mapper.HouseDealMapper;

@Service
public class HouseDealServiceImpl implements HouseDealService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HouseDealDto> searchByDongName(String dong) throws Exception {
		return sqlSession.getMapper(HouseDealMapper.class).searchByDongName(dong);
	}

	@Override
	public List<HouseDealDto> searchByAptName(String AptName) throws Exception {
		return sqlSession.getMapper(HouseDealMapper.class).searchByAptName(AptName);
	}

	@Override
	public List<HouseDealDto> searchByAptNameJaeum(String aptNameJaeum) throws Exception {
		return sqlSession.getMapper(HouseDealMapper.class).searchByAptNameJaeum(aptNameJaeum);
	}

	@Override
	public List<HouseDealDto> searchByDongNameJaeum(String dongNameJaeum) throws Exception {
		return sqlSession.getMapper(HouseDealMapper.class).searchByDongNameJaeum(dongNameJaeum);
	}

}
