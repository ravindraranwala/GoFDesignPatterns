package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public class SimpleCompositor implements Compositor {

	@Override
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth,
			int[] breaks) {
		System.out.println("SimpleCompositor examines components a line at a time to determine where breaks should go");
		return 0;
	}

}
