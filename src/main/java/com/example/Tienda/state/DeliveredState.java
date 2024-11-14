package com.example.Tienda.state;

import com.example.Tienda.model.Order;

public class DeliveredState implements OrderState {

    @Override
    public void process(Order order) {
        System.out.println("El pedido ya ha sido entregado. No es posible ningún procesamiento posterior.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("El pedido ya ha sido entregado. No se puede enviar nuevamente.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("El pedido ya está entregado.");
    }

    @Override
    public String getStatus() {
        return "Entregado";
    }
}
