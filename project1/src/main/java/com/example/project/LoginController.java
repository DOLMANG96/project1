package com.example.project;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping (value = "/login" , method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping (value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Member member, HttpSession session, Model model) {
		if(!member.getId().equals("admin") || !member.getPasswd().equals("123")) {
			
			model.addAttribute("message","x");
			return "login";
		
		}
		return "index";
	}
}
