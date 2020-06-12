package eu.pontsystems.autogyar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.autogyar.entity.User;
import eu.pontsystems.autogyar.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public void userMent(User user) {
		ur.save(user);
	}

	public Optional<User> findByName(String name) {
		
		return ur.findByUsername(name);
	}
}
