package com.lclv.domain;

public class OrderChocolate extends OrderDrink {

    private TEMPERATURE temperature; // Iteration 3
    public OrderChocolate(TEMPERATURE temperature,int sugar) {
        super(sugar);
        super.drinkLabel = "Chocolate";
        super.setPrice(0.5);
        this.temperature = temperature;
    }
    public TEMPERATURE getTemperature() {
        return temperature;
    }

    public void setTemperature(TEMPERATURE temperature) {
        this.temperature = temperature;
    }
}
