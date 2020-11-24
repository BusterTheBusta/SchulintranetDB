/**
 * 
 */
package qene;

import java.util.List;

import annotations.ManyToMany;
import annotations.SqlVarchar;
import annotations.Table;
import orm.Entity;

/**
 * @author kaan.inis
 *
 */
@Table(name = "teacher")
public class Teacher extends Entity<Teacher> {
	
	@ManyToMany(referenceTable = Subject.class)
	List<Subject>subjects;
	
	@SqlVarchar(size = 100)
	String name;
	
	public Teacher() {
		super();
	}

	/**
	 * @param subjects
	 * @param name
	 */
	public Teacher(List<Subject> subjects, String name) {
		super();
		this.subjects = subjects;
		this.name = name;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
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
	
}
