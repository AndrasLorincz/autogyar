package eu.pontsystems.autogyar.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import eu.pontsystems.autogyar.entity.Auto;
import eu.pontsystems.autogyar.entity.Megjegyzes;
import eu.pontsystems.autogyar.repository.AutoRepository;
import eu.pontsystems.autogyar.repository.MegjegyzesRepository;

@Component
public class Autok implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private AutoRepository ar;
	
	@Autowired
	private MegjegyzesRepository mr;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Auto a1=new Auto();
		a1.setType("skoda");
		
		Auto a2=new Auto();
		a2.setType("Trabi");
		
		ar.save(a1);
		ar.save(a2);
		
		Megjegyzes m1=new Megjegyzes();
		m1.setText("sadasdasd");
		mr.save(m1);
	}

}
