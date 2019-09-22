package com.lclv.domain;

public class OrderTea extends OrderDrink {
    public OrderTea(TEMPERATURE temperature,int sugar) {
        super(temperature,sugar);
        super.drinkLabel = "Tea";
        super.setPrice(0.4);
    }
}
