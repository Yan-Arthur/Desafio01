package com.devsuperior.desafio01.entities;

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }


    public static final class OrderBuilder {
        private Integer code;
        private Double basic;
        private Double discount;

        private OrderBuilder() {
        }

        public static OrderBuilder builder() {
            return new OrderBuilder();
        }

        public OrderBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public OrderBuilder basic(Double basic) {
            this.basic = basic;
            return this;
        }

        public OrderBuilder discount(Double discount) {
            this.discount = discount;
            return this;
        }

        public Order build() {
            return new Order(code, basic, discount);
        }
    }
}
