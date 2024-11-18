package en.awhitaker.space.entities.organisms;

import en.awhitaker.space.board.Room;
import en.awhitaker.space.entities.items.Item;

public class Player extends Organism {
	private Room room;
	private Map<Item, Integer> inventory;
	
	/**
	 * Player constructor.
	 *
	 * @param name      the string that will be the player's name
	 * @param maxHp     the maximum HP of the player
	 * @param hp        the initial HP of the player
	 * @param room      the room that the player will start in
	 * @param inventory the map that will be the player's inventory
	 * @throws IllegalArgumentException if:
	 *     <ul>
	 *         <li>the <code>name</code> parameter is blank</li>
	 *         <li>the <code>maxHp</code> or <code>hp</code> parameters are less than 1</li>
	 *         <li>the <code>hp</code> parameter is greater than the <code>maxHp</code> parameter</li>
	 *         <li>the <code>room</code> or <code>inventory</code> parameters are null</li>
	 *     </ul>
	 */
	public Player(String name, int maxHp, int hp, Room room, Map<Item, Integer> inventory) throws IllegalArgumentException {
		super(name, maxHp, hp);
		
		setRoom(room);
		
		if (inventory == null)
			throw new IllegalArgumentException("Inventory cannot be null.");
		
		this.inventory = inventory;
	}
	
	/**
	 * @return the room the player is currently in
	 */
	public Room getRoom() {
		return room;
	}
	
	/**
	 * Sets the room the player is currently in.
	 * @param room the room the player is currently in
	 * @throws IllegalArgumentException if the <code>room</code> parameter is null
	 */
	public void setRoom(Room room) throws IllegalArgumentException {
		if (room == null)
			throw new IllegalArgumentException("Room cannot be null.");
		
		this.room = room;
	}
}
