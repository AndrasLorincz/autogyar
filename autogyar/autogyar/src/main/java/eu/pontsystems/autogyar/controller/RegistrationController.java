package eu.pontsystems.autogyar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.autogyar.entity.User;
import eu.pontsystems.autogyar.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService us;
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@GetMapping(value = "/registration")
	public String registrationView(Model model) {
		model.addAttribute("viewName", "registerpage");
		return "index";		
	}
	
	@PostMapping(value = "/registration")
	public String registration(Model model,User user) {
		Optional<User> u=us.findByName(user.getUsername());
		if(u.isEmpty()) {
		user.setActive(true);
		user.setRoles("ROLE_USER");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		us.userMent(user);
		return "redirect:/login";
		}
		return "redirect:/login";		
	}
}
