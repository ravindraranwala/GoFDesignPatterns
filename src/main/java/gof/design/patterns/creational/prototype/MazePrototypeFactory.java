package gof.design.patterns.creational.prototype;

public class MazePrototypeFactory extends MazeFactory {
	private final Maze prototypeMaze;
	private final Room prototypeRoom;
	private final Wall prototypeWall;
	private final Door prototypeDoor;

	public MazePrototypeFactory(Maze prototypeMaze, Room prototypeRoom, Wall prototypeWall, Door prototypeDoor) {
		super();
		this.prototypeMaze = prototypeMaze;
		this.prototypeRoom = prototypeRoom;
		this.prototypeWall = prototypeWall;
		this.prototypeDoor = prototypeDoor;
	}

	@Override
	public Maze makeMaze() {
		return this.prototypeMaze.clone();
	}

	@Override
	public Wall makeWall() {
		return this.prototypeWall.clone();
	}

	@Override
	public Room makeRoom(int number) {
		final Room room = this.prototypeRoom.clone();
		room.initialize(number);
		return room;
	}

	@Override
	public Door makeDoor(Room roomOne, Room roomTwo) {
		final Door door = this.prototypeDoor.clone();
		door.initialize(roomOne, roomTwo);
		return door;
	}

}
