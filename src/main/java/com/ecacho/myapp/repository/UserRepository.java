package com.ecacho.myapp.repository;

import com.ecacho.myapp.model.database.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);
}