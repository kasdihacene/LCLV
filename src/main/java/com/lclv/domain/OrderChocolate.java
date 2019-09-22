package com.lclv.domain;

public class OrderChocolate extends OrderDrink {
    public OrderChocolate(int sugar) {
        super(sugar);
        super.drinkLabel = "Chocolate";
        super.setPrice(0.5);
    }
}
