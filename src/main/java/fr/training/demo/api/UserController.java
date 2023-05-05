//package fr.training.demo.api;
//
//import fr.training.demo.repository.UserRepository;
//import fr.training.demo.repository.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//
//@RestController
//public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//    @GetMapping("test")
//    public ResponseEntity test() {
//       userRepository.save(new User("cherniii","sgs", LocalDate.now())) ;
//               return ResponseEntity.ok().build();
//    }
//}
