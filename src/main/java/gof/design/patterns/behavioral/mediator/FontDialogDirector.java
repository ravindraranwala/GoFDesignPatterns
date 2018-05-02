package gof.design.patterns.behavioral.mediator;

import java.util.Arrays;

public class FontDialogDirector extends DialogDirector {
	private Button ok;
	private Button cancel;
	private ListBox fontList;
	private EntryField fontName;

	@Override
	public void showDialog() {
		this.createWidgets();
	}

	@Override
	public void widgetChanged(Widget theChangedWidget) {
		if (theChangedWidget == this.fontList) {
			this.fontName.setText(this.fontList.getSelection());
		} else if (theChangedWidget == this.ok) {
			// apply font change and dismiss dialog
			System.out.println("Apply the font change and dismiss the dialog");
		} else if (theChangedWidget == this.cancel) {
			// dismiss dialog
			System.out.println("Dismiss dialog");
		}
	}

	@Override
	protected void createWidgets() {
		this.ok = new Button(this);
		this.ok.setText("Ok");

		this.cancel = new Button(this);
		this.cancel.setText("Cancel");

		this.fontList = new ListBox(this);
		// fill the listBox with the available font names
		this.fontList.setList(Arrays.asList("Times New Roman", "Verdana", "Helvetica", "Arial"));

		this.fontName = new EntryField(this);

		// assemble the widgets in the dialog

		// First simulate a selection on the font list box by the end user.
		this.fontList.handleMouse(new MouseEvent());

	}
}
