package com.mycompany.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myapp.member.service.MemberService;
import com.mycompany.myapp.member.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	@Autowired
	MemberService memberservice;
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String home(Model model) {

		
		return "index";
	}
	
	
	
	
	
	@RequestMapping(value ="signUp", method= RequestMethod.POST)
	public  String signUp(Model m,Member vo) {

		System.out.println(vo);
		int result = 0;
		try {
			result = memberservice.signUp(vo);
			if(result == 1) {
				m.addAttribute("msg", "회원가입 성공");
			} else {
				m.addAttribute("msg", "회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("msg", "회원가입 과정에서 오류 발생");
		} 
		 return "redirect:/";
	}	
		
		
	}



