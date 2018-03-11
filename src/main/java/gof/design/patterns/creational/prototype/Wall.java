package gof.design.patterns.creational.prototype;

public class Wall implements Side {

	@Override
	public void render() {
		System.out.println("Wall");
	}

	public Wall clone() {
		return new Wall();
	}
}
