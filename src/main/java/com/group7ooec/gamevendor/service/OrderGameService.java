package com.group7ooec.gamevendor.service;

import com.group7ooec.gamevendor.model.OrderGame;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface OrderGameService {
    OrderGame create(@NotNull(message = "The products for order cannot be null.") @Valid OrderGame orderProduct);
}
