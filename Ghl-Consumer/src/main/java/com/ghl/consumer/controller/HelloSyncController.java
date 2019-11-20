package com.ghl.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ghl.provider.service.HelloSyncService;

@Controller
@RequestMapping("hello")
public class HelloSyncController {

	@Autowired
	private HelloSyncService helloSyncService;

	@RequestMapping(value = "say")
	@ResponseBody
	public String say(String name) throws Exception {
		System.out.println("hello mvc " + name);
		return helloSyncService.saySync(name);
	}

}
