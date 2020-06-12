package eu.pontsystems.autogyar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.autogyar.entity.Megrendeles;

@Repository
public interface MegrendelesRepository extends JpaRepository<Megrendeles, Integer> {

	Optional<Megrendeles> findById(Integer id);
}
