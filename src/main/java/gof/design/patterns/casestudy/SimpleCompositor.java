package gof.design.patterns.casestudy;

// Concrete Line breaking strategy.
public class SimpleCompositor implements Compositor {

	@Override
	public void compose() {
		System.out.println("SimpleCompositor examines components a line at a time to determine where breaks should go");
	}

	@Override
	public void setComponent(Composition composition) {

	}

}
