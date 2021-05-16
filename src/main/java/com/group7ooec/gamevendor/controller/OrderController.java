package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.model.Order;
import com.group7ooec.gamevendor.service.GameService;
import com.group7ooec.gamevendor.service.OrderGameService;
import com.group7ooec.gamevendor.service.OrderService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class OrderController {
    GameService gameService;
    OrderService orderService;
    OrderGameService orderGameService;

    public OrderController(GameService gameService, OrderService orderService, OrderGameService orderGameService) {
        this.gameService = gameService;
        this.orderService = orderService;
        this.orderGameService = orderGameService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @NotNull Iterable<Order> list() {
        return this.orderService.getAllOrders();
    }



}
