package com.lclv.business;

import com.lclv.domain.OrderDrink;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DrinkBusiness {

    private List<OrderDrink> servedDrinks = new ArrayList<>();

    public void addServedDrink(OrderDrink drink) {
        servedDrinks.add(drink);
    }

    public List<OrderDrink> getServedDrinks() {
        return servedDrinks;
    }

    public Map<String, List<OrderDrink>> reportDrinks(List<OrderDrink> drinks, String when) {
        // Get only drinks of the given Date and group then by type of drink
        return drinks.stream()
                .filter(drink -> drink.getServedDate().equals(when))
                .collect(Collectors.groupingBy(OrderDrink::getDrinkLabel));
    }

    public String printReport(Map<String, List<OrderDrink>> report) {
        StringBuffer stringBuffer = new StringBuffer();
        report.entrySet().stream().forEach(drinkCount -> {
            stringBuffer.append("Drink type : ");
            stringBuffer.append(drinkCount.getKey() + "\n");
            stringBuffer.append("Number of drinks sold : ");
            stringBuffer.append(drinkCount.getValue().size() + "\n");
            stringBuffer.append("Total $ : ");
            stringBuffer.append(drinkCount.getValue().stream().collect(Collectors.summingDouble(OrderDrink::getPrice)) + "\n");
        });
        return stringBuffer.toString();
    }

}
