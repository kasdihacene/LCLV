package com.lclv.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OrderDrinkTest {

    OrderDrink coffee;
    OrderDrink tea;
    OrderDrink chocolate;
    OrderDrink juice;

    @Before
    public void setUp() throws Exception {
        coffee = new OrderCoffee(0);
        tea = new OrderTea(2);
        chocolate = new OrderChocolate(1);
        juice = new OrderJuice();
    }

    @Test
    public void forwardMessage() {
        String message = "Coffee served !";
        Assert.assertTrue(message.equalsIgnoreCase(coffee.forwardMessage(message)));
    }

    @Test
    public void coffeeTest() {
        Assert.assertTrue(!coffee.getStick());
        Assert.assertTrue(coffee.getPrice()==0.6);
        Assert.assertFalse(coffee.insertMoney(0.4));
        Assert.assertTrue(coffee.insertMoney(0.2));
    }

    @Test
    public void teaTest() {
        Assert.assertTrue(tea.getStick());
        Assert.assertTrue(tea.getPrice()==0.4);
    }

    @Test
    public void chocolateTest() {
        Assert.assertTrue(chocolate.getStick());
        Assert.assertTrue(chocolate.getPrice()==0.5);
    }

    @Test
    public void juiceTest() {
        Assert.assertFalse(juice.getStick());
        Assert.assertTrue(juice.getPrice()==0.6);
        Assert.assertTrue(juice.insertMoney(0.7));
    }
}
