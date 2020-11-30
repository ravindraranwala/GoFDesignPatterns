package gof.design.patterns.behavioral.visitor;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	final Map<String, Integer> inventoryDetails = new HashMap<>();

	public void accumulate(Equipment e) {
		inventoryDetails.merge(e.getName(), 1, Integer::sum);
	}

	@Override
	public String toString() {
		return inventoryDetails.toString();
	}

}
