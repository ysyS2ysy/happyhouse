package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.HouseDealDto;

public interface HouseDealService {
	//동별 검색
	List<HouseDealDto> searchByDongName(String dong) throws Exception;
	// 아파트별 검색
	List<HouseDealDto> searchByAptName(String AptName) throws Exception;
	
	List<HouseDealDto> searchByAptNameJaeum(String aptNameJaeum) throws Exception;
	List<HouseDealDto> searchByDongNameJaeum(String dongNameJaeum) throws Exception;
}
