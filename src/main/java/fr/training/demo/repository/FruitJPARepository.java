package fr.training.demo.repository;

import fr.training.demo.modele.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitJPARepository extends JpaRepository<Fruit, Long> {

}
