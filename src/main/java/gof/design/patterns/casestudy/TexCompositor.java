package gof.design.patterns.casestudy;

//Concrete Line breaking strategy.
public class TexCompositor implements Compositor {
	@Override
	public void compose() {
		System.out.println(
				"TeXCompositor examines a paragraph at a time, taking into account the components' size and stretchability.");
	}

	@Override
	public void setComponent(Composition composition) {

	}
}
