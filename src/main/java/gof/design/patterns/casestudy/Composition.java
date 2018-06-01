package gof.design.patterns.casestudy;

import java.util.ArrayList;
import java.util.List;

import gof.design.patterns.structural.adapter.Point;

public class Composition implements Glyph {
	private final List<Glyph> children = new ArrayList<>();
	private final Compositor compositor;

	public Composition(Compositor compositor) {
		super();
		this.compositor = compositor;
	}

	@Override
	public void draw(Window w) {
		this.children.stream().forEach(c -> c.draw(w));
	}

	@Override
	public boolean intersects(Point p) {
		return this.children.stream().allMatch(g -> g.intersects(p));
	}

	@Override
	public void insert(Glyph g, int offset) {
		this.children.add(g);
		this.compositor.compose();
	}

}
