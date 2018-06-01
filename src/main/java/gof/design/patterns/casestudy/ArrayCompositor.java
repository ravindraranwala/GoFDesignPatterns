package gof.design.patterns.casestudy;

//Concrete Line breaking strategy.
public class ArrayCompositor implements Compositor {
	@Override
	public void compose() {
		System.out.println("ArrayCompositor breaks the components into lines at regular intervals");
	}

	@Override
	public void setComponent(Composition composition) {

	}

}
