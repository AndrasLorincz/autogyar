package eu.pontsystems.autogyar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String loginView(Model model) {
		
		model.addAttribute("viewName", "loginpage");
		return "index";
		
	}
}
