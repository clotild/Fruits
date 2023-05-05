package fr.training.demo.api;

import fr.training.demo.modele.Fruit;
import fr.training.demo.repository.FruitJPARepository;
import fr.training.demo.service.FruitJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class FruitJPAController {
    @Autowired
    private FruitJPAService fruitJPAService;
// ------- méthode non performante, obligé de complié pour changer/ajouter un fruit-------------
    @GetMapping("test")
    public ResponseEntity test() {
        fruitJPAService.save(new Fruit("kiki"));
        return ResponseEntity.ok().build();
    }
    //-----------------Bonne méthode------------------
    @PostMapping("fruits")
    public ResponseEntity create (@RequestBody Fruit fruit){
        fruitJPAService.save(fruit);
        return ResponseEntity.ok(fruit);
    }

    @GetMapping("fruits")
    public ResponseEntity fruits() {
        List<Fruit> allFruits = fruitJPAService.fetchAll();
        return ResponseEntity.ok(allFruits);
    }

    @GetMapping("fruits/{id}")
    public ResponseEntity fruitById(@PathVariable("id") int id) {
         Fruit fruit = fruitJPAService.fetchById(id);
        return ResponseEntity.ok(fruit);
    }
}
