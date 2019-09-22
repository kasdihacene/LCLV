package com.lclv.business;

import com.lclv.Application;
import com.lclv.domain.*;
import com.lclv.util.DrinkUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Application.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DrinkBusinessTest {

    @Autowired
    private DrinkBusiness drinkBusiness;

    OrderDrink coffee;
    OrderDrink coffee2;
    OrderDrink coffee3;
    OrderDrink tea;
    OrderDrink chocolate;
    OrderDrink juice;

    @Before
    public void setUp() throws Exception {
        coffee = new OrderCoffee(OrderDrink.TEMPERATURE.EXTRA_HOT, 0);
        coffee2 = new OrderCoffee(OrderDrink.TEMPERATURE.CLASSIC, 1);
        coffee3 = new OrderCoffee(OrderDrink.TEMPERATURE.CLASSIC, 2);
        tea = new OrderTea(OrderDrink.TEMPERATURE.EXTRA_HOT, 2);
        chocolate = new OrderChocolate(OrderDrink.TEMPERATURE.CLASSIC, 1);
        juice = new OrderJuice();
        drinkBusiness.addServedDrink(coffee);
        drinkBusiness.addServedDrink(coffee2);
        drinkBusiness.addServedDrink(coffee3);
        drinkBusiness.addServedDrink(tea);
        drinkBusiness.addServedDrink(tea);
        drinkBusiness.addServedDrink(chocolate);
    }

    @Test
    public void reportDrinks() {
        Map<String, List<OrderDrink>> report = drinkBusiness.reportDrinks(drinkBusiness.getServedDrinks(), DrinkUtils.getCurrentDate());
        Assert.assertTrue(report.get("Tea").size()==2);
        Assert.assertTrue(report.get("Chocolate").size()==1);
        Assert.assertTrue(report.get("Coffee").size()==3);
        System.out.println(drinkBusiness.printReport(report));
    }
}