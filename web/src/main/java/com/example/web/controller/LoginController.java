package com.example.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.pm.Account;
import com.example.service.pm.ILoginService;
import com.example.service.pm.LoginService;



@RestController()
public class LoginController {
	
	@Autowired
	private ILoginService service;
	
	public LoginController(LoginService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public ModelAndView defaultPage(HttpServletRequest request) {
		return new ModelAndView("forward:/goLogin");
	}
	
	@RequestMapping("/goLogin")
	public ModelAndView goLogin(HttpServletRequest request) throws Exception {
		return new ModelAndView("/WEB-INF/Planning_Management/login/login.jsp");
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) throws Exception {
		String accountStr = request.getParameter("account");
		String passwordStr = request.getParameter("password");
		
		Account resAccount = service.getAccount(new Account(accountStr, passwordStr));
		if (resAccount == null) {
			ModelAndView modelAndView = new ModelAndView("forward:/goLogin");
			modelAndView.addObject("message", "用户名不存在！");
			return modelAndView;
		}
		if (!passwordStr.equals(resAccount.getPassword())) {
			ModelAndView modelAndView = new ModelAndView("forward:/goLogin");
			modelAndView.addObject("message", "密码错误！");
			return modelAndView;
		}
		request.getSession().setAttribute("account", resAccount);
		ModelAndView modelAndView = new ModelAndView("forward:/pm/goIndex");
		return modelAndView;
	}

}
