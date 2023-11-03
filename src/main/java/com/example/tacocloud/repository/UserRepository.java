package com.example.tacocloud.repository;

import com.example.tacocloud.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Client, Long> {

    Client findByUsername(String username);
}