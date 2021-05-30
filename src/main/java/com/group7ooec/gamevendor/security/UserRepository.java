package com.group7ooec.gamevendor.security;

import com.group7ooec.gamevendor.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User getUserByUsername(String username);
}
