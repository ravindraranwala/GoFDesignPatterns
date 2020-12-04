package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public class Composition {
	private final Compositor compositor;
	// the list of components
	private Component[] components = new Component[2];
	// the Composition's line width
	private int lineWidth = 100;
	// the position of linebreaks in components
	private int[] lineBreaks;

	public Composition(Compositor compositor) {
		this.compositor = compositor;
		components[0] = new TextComponent();
		components[1] = new GraphicComponent();
	}

	public void repair() {
		Coord[] natural = new Coord[1];
		Coord[] stretchability = new Coord[1];
		Coord[] shrinkability = new Coord[1];

		// prepare the arrays with the desired component sizes
		System.out.println("prepare the arrays with the desired component sizes");
		// determine where the breaks are:
		System.out.println("determine where the breaks are:");
		final int breakCount = this.compositor.compose(natural, stretchability, shrinkability, components.length,
				lineWidth, lineBreaks);

		// layout components according to breaks
		System.out.println("layout components according to breaks");
	}
}
