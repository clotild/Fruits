package fr.training.demo.service;

import fr.training.demo.modele.Fruit;
import fr.training.demo.repository.FruitJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FruitService {
    // private static List<String> fruits = Arrays.asList("Kiwi", "Fraises", "Groseilles");
    @Autowired
    private FruitJdbcRepository fruitRepository;

    public List<Fruit> fetchAll() {
        return fruitRepository.fetchAll();
    }

    public Fruit fetchById(int id) {
        return fruitRepository.fetchOne(id);
    }

    public void create(Fruit fruit) {
        fruitRepository.create(fruit);
    }

//  @Override
//  public boolean create(Object entity) {
//    return false;
//  }
//
//  @Override
//  public List findAll() {
//    return null;
//  }
//
//  @Override
//  public Object findById(Object o) {
//    return null;
//  }
//
//  @Override
//  public void update(Object entity) {
//
//  }
//
//  @Override
//  public void delete(Object entity) {
//
//  }
}

