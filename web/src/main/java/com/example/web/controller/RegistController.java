package com.example.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.pm.Account;
import com.example.domain.pm.User;
import com.example.service.pm.IRegistService;
import com.example.service.pm.RegistService;



@RestController()
public class RegistController {
	@Autowired
	private IRegistService service;
	
	public RegistController(RegistService service) {
		this.service = service;
	}

	@RequestMapping("/goRegist")
	public ModelAndView goRegist(HttpServletRequest request) {
		return new ModelAndView("/WEB-INF/Planning_Management/login/regist.jsp");
	}
	
	@RequestMapping("/regist")
	public ModelAndView regist(HttpServletRequest request) throws Exception {
		String accountStr = request.getParameter("account");
		String passwordStr = request.getParameter("password");
		String emailStr = request.getParameter("email");
		String telephoneStr = request.getParameter("telephone");
		String addressStr = request.getParameter("address");
		String usernameStr = request.getParameter("username");
		String idcardStr = request.getParameter("idcard");
		
		Account account = new Account(accountStr, passwordStr, idcardStr);
		User user = new User(idcardStr, usernameStr, telephoneStr, addressStr, "1", emailStr);
		
		if (service.getAccount(account) != null) {
			service.createAccount(account, user);
		}else {
			throw new Exception("该账号已经存在!");
		}
		
		ModelAndView mav = new ModelAndView("forward:/goLogin");
		mav.addObject("message", "注册成功，请登陆!");
		return mav;
	}
}
