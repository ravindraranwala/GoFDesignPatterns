package gof.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventory {
	private final List<Equipment> equipments = new ArrayList<>();

	public void accumulate(Equipment e) {
		this.equipments.add(e);
	}

	@Override
	public String toString() {
		final Map<String, Long> inventoryDetails = equipments.stream()
				.collect(Collectors.groupingBy(Equipment::getName, Collectors.counting()));
		return inventoryDetails.toString();
	}

}
