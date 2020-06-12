package eu.pontsystems.autogyar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.autogyar.entity.Megrendeles;
import eu.pontsystems.autogyar.service.MegrendelesService;

@Controller
public class MegrendListaController {

	@Autowired
	private MegrendelesService ms;
	
	@GetMapping(value = "/osszeskiir")
	public String megrendelesOsszes(Model model) {
		List<Megrendeles> megrendelesek=ms.findAll();
		model.addAttribute("megrendelesek",megrendelesek);
		model.addAttribute("viewName","osszeskiir");
		return "index";
		
	}
}
