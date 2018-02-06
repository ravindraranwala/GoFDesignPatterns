package gof.design.patterns.creational.abstractfactory;

public class BombedWall extends Wall {

	@Override
	public void render() {
		System.out.println("Bombed Wall");
	}

}
