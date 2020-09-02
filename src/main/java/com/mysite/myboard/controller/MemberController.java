package com.mysite.myboard.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysite.myboard.dto.MemberDTO;
import com.mysite.myboard.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService service;

	// ==========회원가입
	// 회원가입 페이지
	@RequestMapping(value = "/join")
	public String join() throws Exception {
		logger.info("join");

		return "member/join";
	}

	// 회원가입 처리
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String joinAction(MemberDTO bean) throws Exception {
		logger.info("joinAction");

		service.insertMember(bean);

		return "member/login";
	}

	// ==========로그인/아웃
	// 로그인 페이지
	@RequestMapping(value = "/login")
	public String login() throws Exception {
		logger.info("login");

		return "member/login";
	}
	
	//로그인 처리
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String loginAction(MemberDTO bean, HttpSession session, Model model) throws Exception {
		logger.info("loginAction");
		
		boolean result = service.login(bean, session);
		
		if(result == false) {
			model.addAttribute("msg", "fail");
		}
		
		return "member/login";
	}
}
