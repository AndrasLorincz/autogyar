package eu.pontsystems.autogyar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.autogyar.entity.Megjegyzes;
import eu.pontsystems.autogyar.entity.Megrendeles;
import eu.pontsystems.autogyar.service.MegjegyzesService;
import eu.pontsystems.autogyar.service.MegrendelesService;

@Controller
public class ModositController {

	@Autowired
	private MegrendelesService ms;
	
	@Autowired
	private MegjegyzesService mgs;
	
	@GetMapping(value = "megrendelesek")
	public String statusModosit(Model model,Megrendeles megrendeles,Megjegyzes megjegyzes) {
		model.addAttribute("viewName","modosit");
		List<Megrendeles> megrendelesek=ms.findAll();
		model.addAttribute("megrendelesek",megrendelesek);
		return "index";
		
	}
}
