package eu.pontsystems.autogyar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.pontsystems.autogyar.entity.Megjegyzes;
import eu.pontsystems.autogyar.entity.Megrendeles;
import eu.pontsystems.autogyar.service.MegjegyzesService;
import eu.pontsystems.autogyar.service.MegrendelesService;

@Controller
public class MegjegyzesController {

	@Autowired
	private MegjegyzesService mgs;
	
	@Autowired
	private MegrendelesService ms;
	
	@GetMapping(value = "deleteComment")
	public String deleteComment(@RequestParam Integer idcomment, @RequestParam Integer idmegrendel) {
		
		Megjegyzes megjegyzes=mgs.findById(idcomment).get();
		Megrendeles megrendeles=ms.findById(idmegrendel).get();
		megrendeles.getMegjegyzesek().remove(megjegyzes);
		megjegyzes.setMegrendeles(null);
		mgs.comMent(megjegyzes);
		ms.mentes(megrendeles);
		mgs.deleteComment(megjegyzes);
		return "redirect:/osszeskiir";	
	}
}
