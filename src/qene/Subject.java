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
@Table(name = "subject")
public class Subject extends Entity<Subject> {

	@SqlVarchar(size = 100)
	String name;
	
	@SqlVarchar(size = 100)
	String description;
	
	public Subject() {
		super();
	}

	/**
	 * @param name
	 * @param description
	 */
	public Subject(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
