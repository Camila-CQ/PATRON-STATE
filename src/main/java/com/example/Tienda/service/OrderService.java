package com.example.Tienda.service;

import com.example.Tienda.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void processOrder(Order order) {
        System.out.println("Estado Actual: " + order.getStatus());
        order.process();
        System.out.println("Estado Actualizado: " + order.getStatus());
    }

    public void shipOrder(Order order) {
        System.out.println("Estado Actual:  " + order.getStatus());
        order.ship();
        System.out.println("Estado Actualizado:  " + order.getStatus());
    }

    public void deliverOrder(Order order) {
        System.out.println("Estado Actual:  " + order.getStatus());
        order.deliver();
        System.out.println("Estado Actualizado:  " + order.getStatus());
    }
}
