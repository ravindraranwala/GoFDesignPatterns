package gof.design.patterns.creational.abstractfactory;

public class Wall implements Side {

	@Override
	public void render() {
		System.out.println("Wall");
	}
}
