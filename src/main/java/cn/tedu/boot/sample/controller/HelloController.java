package cn.tedu.boot.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("//hello")
public class HelloController {
	@RequestMapping("//hello")
public String showIndew() {
	return "hello.spring boot.";
		
	}
	

}
