package eu.pontsystems.autogyar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.autogyar.entity.Megrendeles;
import eu.pontsystems.autogyar.repository.MegrendelesRepository;

@Service
public class MegrendelesService {

	@Autowired
	private MegrendelesRepository mr;
	
	public void mentes(Megrendeles megrendeles) {
		mr.save(megrendeles);
	}
	
	public List<Megrendeles> findAll(){
		return mr.findAll();		
	}
	
	public Optional<Megrendeles> findById(Integer id) {
		return mr.findById(id);		
	}
}
