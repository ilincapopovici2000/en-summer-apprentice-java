package com.practica.java2023.repository;

import com.practica.java2023.model.User;
import com.practica.java2023.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
