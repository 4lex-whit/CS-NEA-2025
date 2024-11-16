package en.awhitaker.space.entities.organisms;

import en.awhitaker.space.entities.Entity;

public abstract class Organism extends Entity {
	private int maxHp;
	private int hp;
	
	/**
	 * Organism constructor.
	 *
	 * @param name  the string that will be the organism's name
	 * @param maxHp the maximum HP of the organism
	 * @param hp    the initial HP of the organism
	 * @throws IllegalArgumentException if:
	 *     <ul>
	 *         <li>the <code>name</code> parameter is blank</li>
	 *         <li>the <code>maxHp</code> or <code>hp</code> parameters are less than 1</li>
	 *         <li>the <code>hp</code> parameter is greater than the <code>maxHp</code> parameter</li>
	 *     </ul>
	 */
	public Organism(String name, int maxHp, int hp) throws IllegalArgumentException {
		super(name);
		
		setMaxHp(maxHp);
		setHp(hp);
	}
	
	/**
	 * @return the maximum HP of the organism as an int
	 */
	public int getMaxHp() {
		return maxHp;
	}
	
	/**
	 * Sets the maximum HP for the organism.
	 * @param maxHp the maximum HP of the organism
	 * @throws IllegalArgumentException if the <code>maxHp</code> parameter is less than 1
	 */
	public void setMaxHp(int maxHp) throws IllegalArgumentException {
		if (maxHp < 1)
			throw new IllegalArgumentException("Max HP cannot be less than 1.");
		
		this.maxHp = maxHp;
	}
	
	/**
	 * @return the HP of the organism as an int
	 */
	public int getHp() {
		return hp;
	}
	
	/**
	 * Sets the HP for the organism.
	 * @param hp the HP of the organism
	 * @throws IllegalArgumentException if:
	 *     <ul>
	 *         <li>the <code>maxHp</code> parameter is less than 1</li>
	 *         <li>the <code>hp</code> parameter is greater than the organism's <code>maxHp</code></li>
	 *     </ul>
	 */
	public void setHp(int hp) throws IllegalArgumentException {
		if (hp < 1)
			throw new IllegalArgumentException("HP cannot be less than 1.");
		
		if (hp > maxHp)
			throw new IllegalArgumentException("HP cannot be greater than max HP.");
		
		this.hp = hp;
	}
}
