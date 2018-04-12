package com.xw.cxmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xw.cxmanage.service.PlatUserService;

/**
 * Created by shenzhongwu on 2018年4月9日
 */
@Controller
public class LoginController {
	@Autowired
	PlatUserService platUserService;
	@RequestMapping("login")
	public String login(Model model){
		return "login";
		
	}
	@RequestMapping("")
	public String scanView(Model model){
		return "redirect:login";
	}
}
