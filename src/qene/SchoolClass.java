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
@Table(name = "schoolClass")
public class SchoolClass extends Entity<SchoolClass> {
	
	@ManyToMany(referenceTable = Teacher.class)
	List<Teacher> classTeacher;
	
	@SqlVarchar(size = 100)
	String name;
	
	public SchoolClass() {
		super();
	}

	/**
	 * @param classTeacher
	 * @param name
	 */
	public SchoolClass( String name,List<Teacher> classTeacher) {
		super();
		this.classTeacher = classTeacher;
		this.name = name;
	}

	/**
	 * @return the classTeacher
	 */
	public List<Teacher> getClassTeacher() {
		return classTeacher;
	}

	/**
	 * @param classTeacher the classTeacher to set
	 */
	public void setClassTeacher(List<Teacher> classTeacher) {
		this.classTeacher = classTeacher;
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
