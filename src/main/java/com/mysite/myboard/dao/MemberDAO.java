package com.mysite.myboard.dao;

import com.mysite.myboard.dto.MemberDTO;

public interface MemberDAO {
	
	public void insertMember(MemberDTO bean) throws Exception;

	public boolean login(MemberDTO bean) throws Exception;

	public MemberDTO userInfo(MemberDTO bean);
	
}
