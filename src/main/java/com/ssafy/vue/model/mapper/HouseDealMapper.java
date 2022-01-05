package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.vue.model.HouseDealDto;

public interface HouseDealMapper {
	//동별 검색
	List<HouseDealDto> searchByDongName(String dongName) throws SQLException;
	// 아파트별 검색
	List<HouseDealDto> searchByAptName(String AptName) throws SQLException;

	List<HouseDealDto> searchByDongNameJaeum(String dongNameJaeum) throws SQLException;
	List<HouseDealDto> searchByAptNameJaeum(String AptNameJaeum) throws SQLException;
}
