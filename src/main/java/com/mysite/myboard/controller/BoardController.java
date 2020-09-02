package com.mysite.myboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.myboard.dto.BoardDTO;
import com.mysite.myboard.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;

	// 게시물 목록 페이지
	@RequestMapping(value = "/list")
	public String boardList(Model model) throws Exception {
		logger.info("boardList");

		return "board/list";
	}
	
	// 게시물 목록 조회
	@RequestMapping(value = "/listAction")
	@ResponseBody
	public List<BoardDTO> boardListAction() throws Exception {
		logger.info("boardListAction");

		List<BoardDTO> boardList = service.boardList();

		return boardList;
	}
    
}
