package gof.design.patterns.casestudy;

// Notice the Strategy interface.
public interface Compositor {
	void compose();

	void setComponent(Composition composition);
}
