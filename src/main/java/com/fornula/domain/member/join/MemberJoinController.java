package com.fornula.domain.member.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fornula.domain.member.dto.Member;

@Controller
public class MemberJoinController {

	@Autowired
		MemberJoinService memberJoinService;

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getJoin() throws Exception {
		return "join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String postJoin(@ModelAttribute Member member, Model model) throws Exception {
		
		memberJoinService.join(member);
		return "join";
	}
}
