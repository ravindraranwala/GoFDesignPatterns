package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public class ArrayCompositor implements Compositor {
	private final int interval;

	public ArrayCompositor(int interval) {
		this.interval = interval;
	}

	@Override
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth,
			int[] breaks) {
		System.out.println(
				String.format("ArrayCompositor breaks the components into lines at regular intervals %d", interval));
		return 0;
	}

}
