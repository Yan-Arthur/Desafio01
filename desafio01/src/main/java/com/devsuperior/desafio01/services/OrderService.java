package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        double discount = order.getBasic() * (order.getDiscount() / 100);
        double discountPrice = order.getBasic() - discount;
        return discountPrice + shippingService.shipment(order);
    }
}
