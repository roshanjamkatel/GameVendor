package com.group7ooec.gamevendor.repository;
import com.group7ooec.gamevendor.model.Game;
import com.group7ooec.gamevendor.model.ShoppingCart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

    
}