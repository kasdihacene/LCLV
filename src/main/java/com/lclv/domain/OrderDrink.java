package com.lclv.domain;

public class OrderDrink {
    protected String drinkLabel;
    protected int sugar;
    protected boolean stick;
    protected double price;// iteration 2
    protected double insertedMoney;// Iteration 2

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param money : the amount inserted
     * @return true if the amount is greater or equal to the price of the drink
     */
    public boolean insertMoney(double money) {
        return (insertedMoney = insertedMoney + money) >= this.price;
    }
}
