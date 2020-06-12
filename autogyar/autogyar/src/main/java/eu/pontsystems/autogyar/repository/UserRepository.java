package eu.pontsystems.autogyar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.pontsystems.autogyar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String name);
}
