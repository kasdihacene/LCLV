package com.lclv.domain;

public class OrderCoffee extends OrderDrink {
    public OrderCoffee(int sugar) {
        super(sugar);
        super.drinkLabel = "Coffee";
        super.setPrice(0.6);
    }
}
