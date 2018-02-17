package gof.design.patterns.creational.builder;

import java.util.Arrays;
import java.util.List;

import gof.design.patterns.creational.abstractfactory.Door;
import gof.design.patterns.creational.abstractfactory.Room;

/**
 * Defines a more exotic {@link MazeBuilder}
 * 
 * @author URANWRA
 *
 */
public class CountingMazeBuilder extends MazeBuilder {
	private int rooms = 0;
	private int doors = 0;

	@Override
	public void buildRoom(int roomNumber) {
		this.rooms++;
	}

	@Override
	public void buildDoor(int fromRoom, int toRoom) {
		this.doors++;
	}

	/**
	 * Fetches number of {@link Room}s followed by number of {@link Door}s as a
	 * list.
	 * 
	 * @return number of {@link Room}s followed by number of {@link Door}s as a
	 *         list.
	 */
	public List<Integer> getCounts() {
		return Arrays.asList(this.rooms, this.doors);
	}

}
