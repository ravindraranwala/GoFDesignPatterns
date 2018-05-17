package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public class TeXCompositor implements Compositor {

	@Override
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth,
			int[] breaks) {
		System.out.println(
				"TeXCompositor examines a paragraph at a time, taking into account the components' size and stretchability.");
		return 0;
	}

}
