package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.OrderGame;
import com.group7ooec.gamevendor.model.OrderGamePK;
import org.springframework.data.repository.CrudRepository;

public interface OrderGameRepository extends CrudRepository<OrderGame, OrderGamePK> {

}
