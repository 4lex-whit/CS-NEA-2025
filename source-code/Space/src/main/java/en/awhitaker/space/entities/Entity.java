package en.awhitaker.space.entities;

public abstract class Entity {
	private String name;
	
	/**
	 * Entity constructor.
	 * @param name the string that will be the entity's name
	 * @throws IllegalArgumentException if the <code>name</code> parameter is blank
	 */
	public Entity(String name) throws IllegalArgumentException {
		if (name.isBlank())
			throw new IllegalArgumentException("Entity name cannot be blank.");
		
		this.name = name;
	}
	
	/**
	 * @return the name of the entity as a string
	 */
	public String getName() {
		return name;
	}
}
