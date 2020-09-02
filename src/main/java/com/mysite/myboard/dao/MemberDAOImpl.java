package com.mysite.myboard.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mysite.myboard.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sql;
	private static final String Namespace = "memberMapper";
	
	@Override
	public void insertMember(MemberDTO bean) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(Namespace + ".insertMember", bean);
	}

	@Override
	public boolean login(MemberDTO bean) throws Exception {
		// TODO Auto-generated method stub
		int userInfo = sql.selectOne(Namespace + ".login", bean); 
		return (userInfo != 0) ? true : false;
	}

	@Override
	public MemberDTO userInfo(MemberDTO bean) {
		// TODO Auto-generated method stub
		return sql.selectOne(Namespace + ".userInfo", bean);
	}

}
