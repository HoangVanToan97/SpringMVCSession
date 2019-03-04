package vn.hust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hust.model.User;
import vn.hust.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "home", method = RequestMethod.POST)
	public String showHome(@ModelAttribute User user) {
		if (loginService.checkLogin(user)) {
			return "redirect:login";
		} else {
			return "home";
		}

	}

}
