package com.dss.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dss.model.UserModel;

@Controller

public class UserController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String,Object> map)
	
	{
	
		return "register";
	}
	@RequestMapping(value="/details",method=RequestMethod.POST)
	public String Details(@ModelAttribute("model")UserModel model,Map<String,Object> map)
	{
		map.put("fname",model.getFname());
		map.put("lname",model.getLname());
		map.put("email",model.getEmail());
		map.put("mobile",model.getMobile());
		return "user/details";
	}
	

}
