package com.sunny.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/test/join")
	public String test1() {
		return "auth/join";
	}
	
	@GetMapping("/test/login")
	public String test2() {
		return "auth/login";
	}
	
	@GetMapping("/test/following")
	public String test3() {
		return "follow/following";
	}
	
	@GetMapping("/test/explore")
	public String test4() {
		return "image/explore";
	}
	
	@GetMapping("/test/feed")
	public String test5() {
		return "image/feed";
	}
	
	@GetMapping("/test/image-upload")
	public String test6() {
		return "image/image-upload";
	}
	
	@GetMapping("/test/profile")
	public String test7() {
		return "user/profile";
	}
	
	@GetMapping("/test/profile-edit")
	public String test8() {
		return "user/profile-edit";
	}
	
}
