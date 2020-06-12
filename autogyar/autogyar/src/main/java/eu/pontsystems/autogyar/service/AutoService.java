package eu.pontsystems.autogyar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.autogyar.entity.Auto;
import eu.pontsystems.autogyar.repository.AutoRepository;

@Service
public class AutoService {
	
	@Autowired
	private AutoRepository ar;

	public List<Auto> osszesAuto(){
		return ar.findAll();		
	}
	
	public Auto findByType(String type) {
		return ar.findByType(type);
		
	}
	
	public void mentAuto(Auto auto) {
		ar.save(auto);
	}
}
