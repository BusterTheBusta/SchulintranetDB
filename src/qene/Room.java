/**
 * 
 */
package qene;

import annotations.SqlVarchar;
import annotations.Table;
import orm.Entity;

/**
 * @author kaan.inis
 *
 */
@Table(name = "room")
public class Room extends Entity<Room> {

	@SqlVarchar(size = 100)
	String name;

	int seats;
	boolean computerRoom;
	
	public Room() {
		super();
	}

	/**
	 * @param name
	 * @param seats
	 * @param computerRoom
	 */
	public Room(String name, int seats, boolean computerRoom) {
		super();
		this.name = name;
		this.seats = seats;
		this.computerRoom = computerRoom;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return the computerRoom
	 */
	public boolean isComputerRoom() {
		return computerRoom;
	}

	/**
	 * @param computerRoom the computerRoom to set
	 */
	public void setComputerRoom(boolean computerRoom) {
		this.computerRoom = computerRoom;
	}
	
		
}
