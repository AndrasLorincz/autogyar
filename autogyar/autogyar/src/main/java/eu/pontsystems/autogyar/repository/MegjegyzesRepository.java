package eu.pontsystems.autogyar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.autogyar.entity.Megjegyzes;

@Repository
public interface MegjegyzesRepository extends JpaRepository<Megjegyzes, Integer> {

}
