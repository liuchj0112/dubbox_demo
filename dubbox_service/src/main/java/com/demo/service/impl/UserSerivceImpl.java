package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.service.UserService;

@Service
public class UserSerivceImpl implements UserService{

	
	public String getName() {
		
		return "helloworld dubbox!";
	}

}
