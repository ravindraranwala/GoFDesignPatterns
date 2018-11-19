package gof.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private final List<MenuItem> menuItems = new ArrayList<>();

	public void add(MenuItem menuItem) {
		this.menuItems.add(menuItem);
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

}
