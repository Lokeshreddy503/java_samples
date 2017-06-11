package com.dss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloworldController 
{
	@RequestMapping(value="/home",method=RequestMethod.GET)
public String sayHello(ModelMap map)
{
	map.addAttribute("message","lokeshworld");
	return "welcome";
}
	@RequestMapping(value="/home/{name}",method=RequestMethod.GET)
public String sayHelloagain(@PathVariable("name")String user, ModelMap map)
{
	map.addAttribute("message","lokesh2world");
	map.addAttribute("username","username is:"+user);
	return "welcome";
}
}
