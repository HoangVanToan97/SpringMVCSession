package vn.hust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import vn.hust.model.User;
import vn.hust.service.LoginService;

@Controller
@SessionAttributes("users")
public class PageController {
	@Autowired
	private LoginService loginService;

	@GetMapping({ "/", "welcome" })
	public String showWelcome() {
		return "welcome";
	}

	@GetMapping("login")
	public String showLogin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("users") == null) {
			return "login";
		}else {
			return "home";
		}
	}

	@PostMapping("home")
	public String showHome(HttpServletRequest request, @ModelAttribute User user) {
		if(loginService.checkLogin(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("users", user);
			return "home";
		}else {
			return "redirect:login?message=error";
		}
	}	

}
