package com.group7ooec.gamevendor.service;

import com.group7ooec.gamevendor.model.OrderGame;
import com.group7ooec.gamevendor.repository.OrderGameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class OrderGameServiceImpl implements OrderGameService {
    private OrderGameRepository orderGameRepository;

    public OrderGameServiceImpl(OrderGameRepository orderGameRepository) {
        this.orderGameRepository = orderGameRepository;
    }

    @Override
    public OrderGame create(OrderGame orderGame) {
        return this.orderGameRepository.save(orderGame);
    }
}
