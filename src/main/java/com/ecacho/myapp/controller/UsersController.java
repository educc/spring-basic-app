package com.ecacho.myapp.controller;

import com.ecacho.myapp.model.database.User;
import com.ecacho.myapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserRepository userRepo;

    @GetMapping
    Iterable<User> get(){
        return userRepo.findAll();
    }

    @PostMapping
    ResponseEntity post(@RequestBody User user) {
        userRepo.save(user);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @RequestMapping("/findbylastname")
    List<User> fetchDataByLastName(@RequestParam("lastname") String lastName){
        return userRepo.findByLastName(lastName);
    }

}