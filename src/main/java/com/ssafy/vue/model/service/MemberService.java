package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {
	public void registerUser(MemberDto userDto) throws Exception;
	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	public boolean modifyUser(MemberDto memberDto) throws Exception;
	public boolean deleteUser(String userid) throws Exception;
	public int checkId(String userid) throws Exception;
}
