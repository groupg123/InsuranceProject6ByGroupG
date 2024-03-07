package com.insurance.rescontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/getmessage")
	public String getmessage() {
		return "Welcome To Insurance Project 6 By Group G";
		
	}

}
