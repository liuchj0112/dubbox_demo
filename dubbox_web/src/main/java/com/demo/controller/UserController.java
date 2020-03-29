package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Reference
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/showName")
	public String getName() {
		return userService.getName();
	}

}
