/**
 * 
 */
package java;

/**
 * @author Sandra
 *
 */
public enum ShifuEnum {
	ROCK(0, "R"),
	SCISSOR(1, "S"),
	PAPER(2, "P");
	
	/** Id. */
	private int id;
	/** Name. */
	private String name;
	
	/**
	 * Constructor.
	 * @param id the id.
	 * @param name the name.
	 */
	private ShifuEnum (int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Get the id.
	 * @return the id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Get the name.
	 * @return the name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Get the value.
	 * @return the value.
	 */
	public String getValue() {
		return this.name;
	}
	
	/**
	 * Retrieve ShifuEnum with a given string.
	 * @param value the enum string
	 * @return the enum constant.
	 */
	public static ShifuEnum fromValue(String value) {
		ShifuEnum result = null;
		
		if (SCISSOR.getValue().equalsIgnoreCase(value)) {
			result = SCISSOR;
		} else if (PAPER.getValue().equalsIgnoreCase(value)) {
			result = PAPER;
		} else if (ROCK.getValue().equalsIgnoreCase(value)) {
			result = ROCK;
		}
		
		return result;
		
	}
}
