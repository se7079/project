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

	// ==========ȸ������
	// ȸ������ ������
	@RequestMapping(value = "/join")
	public String join() throws Exception {
		logger.info("join");

		return "member/join";
	}

	// ȸ������ ó��
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String joinAction(MemberDTO bean) throws Exception {
		logger.info("joinAction");

		service.insertMember(bean);

		return "member/login";
	}

	// ==========�α���/�ƿ�
	// �α��� ������
	@RequestMapping(value = "/login")
	public String login() throws Exception {
		logger.info("login");

		return "member/login";
	}
	
	//�α��� ó��
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
