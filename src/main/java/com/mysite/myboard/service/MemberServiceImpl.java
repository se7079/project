package com.mysite.myboard.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.mysite.myboard.dao.MemberDAO;
import com.mysite.myboard.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;

	@Override
	public void insertMember(MemberDTO bean) throws Exception {
		// TODO Auto-generated method stub
		dao.insertMember(bean);
	}

	@Override
	public boolean login(MemberDTO bean, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		boolean result = dao.login(bean);
		if(result) {
			session.setAttribute("user", dao.userInfo(bean));
		}
		return result;
	}

}
