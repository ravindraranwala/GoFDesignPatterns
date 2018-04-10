package gof.design.patterns.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		final Window window = new Window();
		final TextView textView = new TextView();
		VisualComponent textViewWithBorderAndScroll = new BorderDecorator(new ScrollDecorator(textView), 1);
		textViewWithBorderAndScroll.draw();
		window.setContents(textViewWithBorderAndScroll);
	}

}
