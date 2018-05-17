package gof.design.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import gof.design.patterns.structural.adapter.Coord;

public class Composition {
	private final Compositor compositor;
	// the list of components
	private List<Component> components = new ArrayList<>();
	// the number of lines
	private int lineCount = 10;
	// the Composition's line width
	private int lineWidth = 100;
	// the position of linebreaks in components
	private int[] lineBreaks;

	public Composition(Compositor compositor) {
		super();
		this.compositor = compositor;
		this.components.add(new TextComponent());
		this.components.add(new GraphicComponent());
	}

	public void repair() {
		Coord[] natural = new Coord[1];
		Coord[] stretchability = new Coord[1];
		Coord[] shrinkability = new Coord[1];

		// prepare the arrays with the desired component sizes
		System.out.println("prepare the arrays with the desired component sizes");
		// determine where the breaks are:
		System.out.println("determine where the breaks are:");
		int breakCount = this.compositor.compose(natural, stretchability, shrinkability, components.size(), lineWidth,
				lineBreaks);

		// lay out components according to breaks
		System.out.println("lay out components according to breaks");
	}
}
