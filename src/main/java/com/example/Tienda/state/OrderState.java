package com.example.Tienda.state;

import com.example.Tienda.model.Order;

public interface OrderState {
    void process(Order order);

    void ship(Order order);

    void deliver(Order order);

    String getStatus();
}
