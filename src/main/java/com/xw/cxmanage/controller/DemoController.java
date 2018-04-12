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
@RequestMapping("demo")
public class DemoController {
	
	@Autowired
	PlatUserService platUserService;
	@RequestMapping("fan")
	public String getPlatUser(Model model){
		model.addAttribute("platUser", platUserService.selectByPrimaryKey("1"));
		return "login";
		
	}
}
