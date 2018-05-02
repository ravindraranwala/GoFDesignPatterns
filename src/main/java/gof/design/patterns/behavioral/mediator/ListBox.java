package gof.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListBox extends Widget {
	private List<String> listItems = new ArrayList<>();
	private int selectedIndex = -1;

	public ListBox(DialogDirector director) {
		super(director);
	}

	@Override
	public void handleMouse(MouseEvent event) {
		System.out.println("Listbox is selected.");
		this.selectedIndex = new Random().nextInt(listItems.size());
		this.changed();
	}

	public String getSelection() {
		return this.listItems.get(this.selectedIndex);
	}

	public void setList(List<String> listItems) {
		this.listItems = listItems;
	}

}
