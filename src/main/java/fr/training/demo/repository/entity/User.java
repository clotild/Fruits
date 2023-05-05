//package fr.training.demo.repository.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//import java.time.LocalDate;
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String firstname;
//    private String lastname;
//    private LocalDate birthdate;
//
//
//    public User(String firstname, String lastname, LocalDate birthdate) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.birthdate = birthdate;
//    }
//
//    public User() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public LocalDate getBirthdate() {
//        return birthdate;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public void setBirthdate(LocalDate birthdate) {
//        this.birthdate = birthdate;
//    }
//}
