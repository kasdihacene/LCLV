package com.lclv.domain;

public class OrderCoffee extends OrderDrink {
    public OrderCoffee(TEMPERATURE temperature,int sugar) {
        super(temperature,sugar);
        super.drinkLabel = "Coffee";
        super.setPrice(0.6);
    }
}
