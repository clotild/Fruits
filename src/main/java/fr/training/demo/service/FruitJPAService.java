package fr.training.demo.service;

import fr.training.demo.modele.Fruit;
import fr.training.demo.repository.FruitJPARepository;
import fr.training.demo.repository.FruitJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitJPAService {
    @Autowired
    private FruitJPARepository fruitJPARepository;

    public List<Fruit> fetchAll() {
        return fruitJPARepository.findAll();
    }

    public Fruit fetchById(int id) {
        return fruitJPARepository.findById(Long.valueOf(id)).get();
    }

    public void save(Fruit fruit) {
        fruitJPARepository.save(fruit);
    }
}
