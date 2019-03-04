package vn.hust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hust.model.User;
import vn.hust.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "register")
	public String showRegister() {
		return "register";
	}

	@RequestMapping(value = "checkRegister", method = RequestMethod.POST)
	public String showLogins(@ModelAttribute User user) {
		if (registerService.checkRegister(user)) {
			return "login";
		} else {
			return "redirect:register";
		}
	}

}
