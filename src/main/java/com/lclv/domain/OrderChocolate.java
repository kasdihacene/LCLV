package com.lclv.domain;

public class OrderChocolate extends OrderDrink {
    public OrderChocolate(TEMPERATURE temperature,int sugar) {
        super(temperature,sugar);
        super.drinkLabel = "Chocolate";
        super.setPrice(0.5);
    }
}
