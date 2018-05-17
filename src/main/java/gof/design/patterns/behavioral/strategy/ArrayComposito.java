package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public class ArrayComposito implements Compositor {
	private final int interval;

	public ArrayComposito(int interval) {
		super();
		this.interval = interval;
	}

	@Override
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth,
			int[] breaks) {
		System.out.println("ArrayCompositor breaks the components into lines at regular intervals");
		return 0;
	}

}
