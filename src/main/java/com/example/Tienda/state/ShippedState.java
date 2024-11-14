package com.example.Tienda.state;

import com.example.Tienda.model.Order;

public class ShippedState implements OrderState {

    @Override
    public void process(Order order) {
        System.out.println("El pedido ya ha sido procesado y enviado.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("El pedido ya está enviado.");
    }

    @Override
    public void deliver(Order order) {
        order.setState(new DeliveredState());
        System.out.println("El pedido ya fue entregado");
    }

    @Override
    public String getStatus() {
        return "Enviado";
    }
}
