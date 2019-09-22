package com.lclv.domain;

public class OrderDrink {
    protected String drinkLabel;
    protected int sugar;
    protected boolean stick;

    public OrderDrink() {
        super();
        this.stick = false;
        this.sugar = 0;
    }

    public OrderDrink(int sugar) {
        super();
        this.stick = sugar > 0;
        this.sugar = sugar;
    }

    public String getDrinkLabel() {
        return drinkLabel;
    }

    public void setDrinkLabel(String drinkLabel) {
        this.drinkLabel = drinkLabel;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public boolean getStick() {
        return stick;
    }

    public void setStick(boolean stick) {
        this.stick = stick;
    }

    public String forwardMessage(String messageContent) {
        return messageContent;
    }

}
