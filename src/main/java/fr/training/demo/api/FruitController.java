package fr.training.demo.api;


import fr.training.demo.modele.Fruit;
import fr.training.demo.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
//@RequestMapping("/fruits")

public class FruitController {
    // private static FruitService fruitService = new FruitService();

    @Autowired
    private FruitService fruitService;

    @GetMapping("/fruits")
// on peut remplacer getmapping par requestmapping (method = requestmethod.get)
    public String fruits (Model model) {
       model.addAttribute("fruits", fruitService.fetchAll());
       return "fruits";
    }
    @GetMapping ("/createFruits")
    public String createFruit (Model model) {
        model.addAttribute("fruit", new Fruit());
        return "create";
    }
    @PostMapping("/createFruit")
    public String createFruitSubmit (@ModelAttribute Fruit fruit, Model model) {
        fruitService.create(fruit);
        return "redirect:/fruits";
    }

//    @GetMapping("/{id}")
//    public Fruit fetchById(@PathVariable(name = "id") int id) {
//        return fruitService.fetchById(id);
//    }
//
//    @PostMapping("/create")
//    public Fruit create(@RequestBody Fruit fruit) {
//      return  fruitService.create(fruit);
//    }

}
