package gof.design.patterns.behavioral.strategy;

import gof.design.patterns.structural.adapter.Coord;

public interface Compositor {
	int compose(Coord natural[], Coord stretch[], Coord shrink[], int componentCount, int lineWidth, int breaks[]);
}
