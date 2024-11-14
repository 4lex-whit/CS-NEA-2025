package en.awhitaker.space.entities.organisms;

import en.awhitaker.space.entities.Entity;

public abstract class Organism extends Entity {
	private int maxHp;
	private int hp;
	
	/**
	 * Organism constructor.
	 *
	 * @param name  the string that will be the organism's name
	 * @param maxHp the maximum hp of the organism
	 * @param hp    the initial hp of the organism
	 * @throws IllegalArgumentException if:
	 *     <ul>
	 *         <li>the <code>name</code> parameter is blank</li>
	 *         <li>the <code>maxHp</code> or <code>hp</code> parameters are less than 1</li>
	 *         <li>the <code>hp</code> parameter is greater than the <code>maxHp</code> parameter</li>
	 *     </ul>
	 */
	public Organism(String name, int maxHp, int hp) throws IllegalArgumentException {
		super(name);
		
		if (maxHp < 1)
			throw new IllegalArgumentException("Max HP cannot be less than 1.");
		
		if (hp < 1)
			throw new IllegalArgumentException("HP cannot be less than 1.");
		
		if (hp > maxHp)
			throw new IllegalArgumentException("HP cannot be greater than max HP.");
		
		this.maxHp = hp;
		this.hp = hp;
	}
	
	/**
	 * @return the maximum HP of the organism as an int
	 */
	public int getMaxHp() {
		return maxHp;
	}
}
