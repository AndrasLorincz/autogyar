package eu.pontsystems.autogyar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.autogyar.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

	Auto findByType(String type);
}
