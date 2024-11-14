package com.example.Tienda.controller;

import com.example.Tienda.model.Order;
import com.example.Tienda.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Instancia de prueba
    private Order order = new Order();

    @GetMapping("/status")
    public String getOrderStatus() {
        return "Estado actual del pedido: " + order.getStatus();
    }

    @PostMapping("/process")
    public String processOrder() {
        orderService.processOrder(order);
        return "Orden procesada. Estado Actual: " + order.getStatus();
    }

    @PostMapping("/ship")
    public String shipOrder() {
        orderService.shipOrder(order);
        return "Orden Enviada. Estado Actual: " + order.getStatus();
    }

    @PostMapping("/deliver")
    public String deliverOrder() {
        orderService.deliverOrder(order);
        return "Orden entregado. Estado Actual: " + order.getStatus();
    }
}
