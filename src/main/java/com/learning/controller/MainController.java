package com.learning.controller;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(method=RequestMethod.GET, value="/")
	public String homePage() {
		return "Hello, welcome to my world.";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String helloPage() {
		return "Hello, welcome to hello Page.";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/admin")
	public String adminPage() {
		return "Hello, welcome to admin Page.";
	}
	@RequestMapping(method=RequestMethod.GET, value="/dba")
	public String dbaPage() {
		return "Hello, welcome to DBA Page.";
	}
	@RequestMapping(method=RequestMethod.GET, value="/json")
	public String json() {
		return "[{\\\"id\\\":\\\"1\\\",\\\"name\\\":\\\"Hello User\\\"},{\"id\":\"2\",\"name\":\"ankit\"}]";
	}
	@RequestMapping(method=RequestMethod.GET, value="/accessDenied")
	public String accessDenied() {
		return "Access Denied.";
	}
	
	public static void main(String argsp[]) {
		String encoded = new BCryptPasswordEncoder().encode("123456");
		System.out.println(encoded);
		//System.out.println(new BCryptPasswordEncoder().);
		System.out.println(BCrypt.hashpw("123456",BCrypt.gensalt(4)));
	}
}
