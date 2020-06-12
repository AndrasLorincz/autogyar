package eu.pontsystems.autogyar.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.autogyar.entity.Megjegyzes;
import eu.pontsystems.autogyar.entity.User;
import eu.pontsystems.autogyar.repository.MegjegyzesRepository;

@Service
public class MegjegyzesService {

	@Autowired
	private MegjegyzesRepository mgr;
	
	public void comMent(Megjegyzes megjegyzes) {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date=new Date(System.currentTimeMillis());
		megjegyzes.setCrd(date);
//		megjegyzes.setCru(date);
		megjegyzes.setLmd(date);
//		megjegyzes.setLmu(date);
		mgr.save(megjegyzes);
	}
	
	public Optional<Megjegyzes> findById(Integer id) {
		return mgr.findById(id);
		
	}
	
	public void deleteComment(Megjegyzes megjegyzes) {
		mgr.delete(megjegyzes);
	}
}
