package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.MemoDto;

public interface MemoService {
	public List<MemoDto> getMemoList(int articleno) throws Exception;
	public boolean writeMemo(MemoDto memoDto) throws Exception;
	public boolean modifyMemo(MemoDto memoDto) throws Exception;
	public void deleteMemo(int memono) throws Exception;
	public void addRecommend(MemoDto memoDto) throws Exception;
}
