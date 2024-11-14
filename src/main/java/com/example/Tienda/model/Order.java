package com.example.Tienda.model;

import com.example.Tienda.state.OrderState;
import com.example.Tienda.state.PendingState;

public class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new PendingState(); // Estado inicial
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void process() {
        currentState.process(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }

    public String getStatus() {
        return currentState.getStatus();
    }
}
