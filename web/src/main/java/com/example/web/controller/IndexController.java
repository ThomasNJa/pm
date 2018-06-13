package com.example.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class IndexController {

	@RequestMapping("/pm/goIndex")
	public ModelAndView goIndex(HttpServletRequest request) {
		return new ModelAndView("/WEB-INF/Planning_Management/index/index.jsp");
	}
	
}
