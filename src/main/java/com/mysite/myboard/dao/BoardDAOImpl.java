package com.mysite.myboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mysite.myboard.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	private static final String Namespace = "boardMapper";
	
	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		return sql.selectList(Namespace + ".boardList");
	}

}
