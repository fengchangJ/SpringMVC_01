package com.atguigu.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller 
 * @author Admin
 *
 */
@Controller
public class HelloWorldHandler {
	/**
	 *	浏览器端发送的请求： http://localhost:8080/SpringMVC01/hello
	 * 
	 * @RequestMapping:
	 */
	@RequestMapping(value = "/hello")
	public String handleHello() {
		System.out.println("Hello SpringMVC...");
		//
		return "success";
	}
}
