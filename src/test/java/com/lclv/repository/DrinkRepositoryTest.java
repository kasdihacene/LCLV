package com.lclv.repository;

import com.lclv.domain.OrderCoffee;
import com.lclv.domain.OrderDrink;
import com.lclv.domain.OrderJuice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class DrinkRepositoryTest {

    @Autowired
    private DrinkRepository drinkRepository = new DrinkRepository();

    private OrderDrink juice;
    private OrderDrink coffee;

    @Before
    public void setUp() throws Exception {
        Map<String, Integer> tankMock = new HashMap<>();
        tankMock.put("Coffee", 10);
        tankMock.put("Juice", 0);
        tankMock.put("Water", 10);
        coffee = new OrderCoffee(OrderDrink.TEMPERATURE.EXTRA_HOT, 2);
        juice = new OrderJuice();
        drinkRepository.setTankMock(tankMock);
    }

    @Test
    public void notifyMissingDrink() {
        drinkRepository.askForDrink(coffee);
        drinkRepository.askForDrink(juice);
    }
}