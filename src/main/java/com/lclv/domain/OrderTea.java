package com.lclv.domain;

public class OrderTea extends OrderDrink {

    private TEMPERATURE temperature; // Iteration 3
    public OrderTea(TEMPERATURE temperature,int sugar) {
        super(sugar);
        super.drinkLabel = "Tea";
        super.setPrice(0.4);
        this.temperature = temperature;
    }
    public TEMPERATURE getTemperature() {
        return temperature;
    }

    public void setTemperature(TEMPERATURE temperature) {
        this.temperature = temperature;
    }
}
