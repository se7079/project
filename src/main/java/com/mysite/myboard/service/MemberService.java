package com.mysite.myboard.service;


import javax.servlet.http.HttpSession;

import com.mysite.myboard.dto.MemberDTO;

public interface MemberService {
	
	public void insertMember(MemberDTO bean) throws Exception;

	public boolean login(MemberDTO bean, HttpSession session) throws Exception;

}
