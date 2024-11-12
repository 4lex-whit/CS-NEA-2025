package en.awhitaker.space.entities.organisms;

import en.awhitaker.space.entities.Entity;

public abstract class Organism extends Entity {
	private String name;
	private int hp;
	
	/**
	 * Organism constructor.
	 *
	 * @param name the string that will be the organism's name
	 * @param hp   the hp of the organism
	 * @throws IllegalArgumentException if:
	 *     <ul>
	 *         <li>the <code>name</code> parameter is blank</li>
	 *         <li>the <code>hp</code> parameter is less than 1</li>
	 *     </ul>
	 */
	public Organism(String name, int hp) throws IllegalArgumentException {
		super(name);
		
		if (hp <= 0)
			throw new IllegalArgumentException("HP cannot be less than 1.");
		
		this.hp = hp;
	}
}
