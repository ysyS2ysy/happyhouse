package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.MemoDto;

@Mapper
public interface MemoMapper {
	public List<MemoDto> getMemoList(int articleno) throws SQLException;
	public int writeMemo(MemoDto memoDto) throws SQLException;
	public int modifyMemo(MemoDto memoDto) throws SQLException;
	public void deleteMemo(int memono) throws SQLException;
	public void addRecommend(MemoDto memoDto) throws SQLException;
}
