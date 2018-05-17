package gof.design.patterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// final Composition quick = new Composition(new SimpleCompositor());
		final Composition slick = new Composition(new TeXCompositor());
		// final Composition iconic = new Composition(new ArrayComposito(100));
		slick.repair();
	}

}
