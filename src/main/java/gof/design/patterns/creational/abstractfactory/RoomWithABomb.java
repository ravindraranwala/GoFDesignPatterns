package gof.design.patterns.creational.abstractfactory;

public class RoomWithABomb extends Room {

	public RoomWithABomb(int number) {
		super(number);
	}

	@Override
	public void render() {
		System.out.println("Room With a Bomb.");
		super.render();
	}

}
