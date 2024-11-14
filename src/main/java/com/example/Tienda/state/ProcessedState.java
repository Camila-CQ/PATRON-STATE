package com.example.Tienda.state;

import com.example.Tienda.model.Order;

public class ProcessedState implements OrderState {

    @Override
    public void process(Order order) {
        System.out.println("El pedido ya está procesado.");
    }

    @Override
    public void ship(Order order) {
        order.setState(new ShippedState());
        System.out.println("El pedido ya está enviado.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("El pedido no se puede entregar hasta que se envíe.");
    }

    @Override
    public String getStatus() {
        return "Procesado";
    }
}
