package com.lclv.domain;

public class OrderCoffee extends OrderDrink {

    private TEMPERATURE temperature; // Iteration 3

    public OrderCoffee(TEMPERATURE temperature,int sugar) {
        super(sugar);
        super.drinkLabel = "Coffee";
        super.setPrice(0.6);
        this.temperature = temperature;
    }
    public TEMPERATURE getTemperature() {
        return temperature;
    }

    public void setTemperature(TEMPERATURE temperature) {
        this.temperature = temperature;
    }
}
