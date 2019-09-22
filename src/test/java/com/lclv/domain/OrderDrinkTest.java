package com.lclv.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OrderDrinkTest {

    OrderDrink coffee;
    OrderDrink tea;
    OrderDrink chocolate;

    @Before
    public void setUp() throws Exception {
        coffee = new OrderCoffee(0);
        tea = new OrderTea(2);
        chocolate = new OrderChocolate(1);
    }

    @Test
    public void forwardMessage() {
        String message = "Coffee served !";
        Assert.assertTrue(message.equalsIgnoreCase(coffee.forwardMessage(message)));
    }

    @Test
    public void coffeeTest() {
        Assert.assertTrue(!coffee.getStick());
    }

    @Test
    public void teaTest() {
        Assert.assertTrue(tea.getStick());
    }

    @Test
    public void chocolateTest() {
        Assert.assertTrue(chocolate.getStick());
    }
}