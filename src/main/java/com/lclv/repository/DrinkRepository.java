package com.lclv.repository;

import com.lclv.domain.OrderDrink;

import java.util.Map;

public class DrinkRepository implements EmailNotifier, BeverageQuantityChecker {
	
	//===================================================
	// This section must be replaced by a real API which returns
	// a quantity of the rank according to the drink (water, milk, juice ...)
	//===================================================
	private Map<String, Integer> tankMock ;
	public void setTankMock(Map<String, Integer> tankMock) {
		this.tankMock = tankMock;
	}
	//===================================================
	
	@Override
	public boolean isEmpty(String drink) {
		if (tankMock.containsKey(drink)) {
			return (tankMock.get(drink) <= 0);
		}
		return true;
	}

	@Override
	public void notifyMissingDrink(String drink) {
		if (this.isEmpty(drink)) {
			String message = String.format("No %s in the tank, a notification has been sent for maintenance.", drink);
			System.out.print(message);
		}
	}

	public void askForDrink(OrderDrink orderDrink){
		if (isEmpty(orderDrink.getDrinkLabel()))
			notifyMissingDrink(orderDrink.getDrinkLabel());
	}

}
