package com.example.Tienda.state;

import com.example.Tienda.model.Order;

public class PendingState implements OrderState {

    @Override
    public void process(Order order) {
        order.setState(new ProcessedState());
        System.out.println("El pedido ya está procesado.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("El pedido no se puede enviar hasta que se procese.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("El pedido no se puede entregar hasta que se envíe.");
    }

    @Override
    public String getStatus() {
        return "Pendiente";
    }
}
