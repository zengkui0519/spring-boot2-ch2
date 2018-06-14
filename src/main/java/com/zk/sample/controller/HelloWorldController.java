package com.zk.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public @ResponseBody String say(){
		return "hello world";
	}
	
	@RequestMapping("/say/{name}")
	public @ResponseBody String say(@PathVariable String name){
		return "hello world "+name;
	}
}
