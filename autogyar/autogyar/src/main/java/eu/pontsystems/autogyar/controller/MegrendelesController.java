package eu.pontsystems.autogyar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.pontsystems.autogyar.entity.Auto;
import eu.pontsystems.autogyar.entity.Megjegyzes;
import eu.pontsystems.autogyar.entity.Megrendeles;
import eu.pontsystems.autogyar.service.AutoService;
import eu.pontsystems.autogyar.service.MegjegyzesService;
import eu.pontsystems.autogyar.service.MegrendelesService;

@Controller
public class MegrendelesController {
	
	@Autowired
	private AutoService as;
	
	@Autowired
	private MegrendelesService ms;
	
	@Autowired
	private MegjegyzesService mgs;
	

	@GetMapping(value = "/megrendeles")
	public String megrendeles(Model model) {
		model.addAttribute("viewName", "ujmegrendeles");
		List<Auto> autok=as.osszesAuto();
		model.addAttribute("autok", autok);
		return "index";
		
	}
	
	@PostMapping(value = "/rogzit")
	public String rogzit(@RequestParam List<String> text,Megrendeles megrendeles,Model model,Auto auto) {
		model.addAttribute("viewName", "ujmegrendeles");
//		Auto auto=as.findByType(type);
		if(auto.getType()!=null) {
			for (int i = 0; i < text.size(); i++) {
				Megjegyzes megjegyzes=new Megjegyzes();
				megjegyzes.setText(text.get(i));
				megjegyzes.setMegrendeles(megrendeles);
				mgs.comMent(megjegyzes);
				megrendeles.getMegjegyzesek().add(megjegyzes);
			}
			as.mentAuto(auto);
			megrendeles.setAuto(auto);
			megrendeles.setStatus("Megrendelve");	
			ms.mentes(megrendeles);
			for (Megjegyzes com : megrendeles.getMegjegyzesek()) {
				System.out.println(com.getText());
			}
			return "redirect:/";
		}
		return "redirect:/megrendeles";
	}
}
