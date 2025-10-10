package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import com.devsuperior.desafio01.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(Desafio01Application.class, args);


	}


    @Override
    public void run(String... args) {
        Order order = new Order(1034, 150D, 0.2D);
        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService();

        double total = orderService.total(order) + shippingService.shipment(order);


        System.out.printf("Pedido código: %d\nValor total: R$%.2f", order.getCode(), total);
    }
}
