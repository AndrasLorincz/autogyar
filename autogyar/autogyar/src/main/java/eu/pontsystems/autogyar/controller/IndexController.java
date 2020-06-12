package eu.pontsystems.autogyar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping(value = "/")
	public String indexView(Model model) {
		model.addAttribute("viewName","Mainmenu");
		return "index";
		
	}
}
