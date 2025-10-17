package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import com.devsuperior.desafio01.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

    @Autowired
    OrderService orderService;

	public static void main(String[] args) {

        SpringApplication.run(Desafio01Application.class, args);
	}

    @Override
    public void run(String... args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do pedido");
        System.out.print("Número do pedido: ");
        int code = sc.nextInt();
        System.out.print("Valor básico: ");
        double basic = sc.nextDouble();
        System.out.print("Valor do desconto: ");
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);



        System.out.printf("Pedido código: %d\nValor total: R$ %.2f", order.getCode(), orderService.total(order));

        sc.close();
    }
}
