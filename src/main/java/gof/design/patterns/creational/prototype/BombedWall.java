package gof.design.patterns.creational.prototype;

public class BombedWall extends Wall {
	private boolean bomb;

	// Notice: The copy constructor.
	public BombedWall(boolean bomb) {
		super();
		this.bomb = bomb;
	}

	private BombedWall(final BombedWall other) {
		this.bomb = other.bomb;
	}

	@Override
	public Wall clone() {
		return new BombedWall(this);
	}

}
