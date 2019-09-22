package com.lclv.domain;

public class OrderTea extends OrderDrink {
    public OrderTea(int sugar) {
        super(sugar);
        super.drinkLabel = "Tea";
        super.setPrice(0.4);
    }
}
