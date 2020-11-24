/**
 * 
 */
package qene;

import java.sql.Date;
import java.util.List;

import annotations.OneToMany;
import annotations.Table;
import orm.Entity;

/**
 * @author kaan.inis
 *
 */
@Table(name = "day")
public class Day extends Entity<Day> {
	
	@OneToMany(referenceTable = Lesson.class)
	List<Lesson> lessons;
	Date date;
	
	public Day() {
		super();
	}

	
	/**
	 * @param lessons
	 * @param date
	 */
	public Day(List<Lesson> lessons, Date date) {
		super();
		this.lessons = lessons;
		this.date = date;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the lessons
	 */
	public List<Lesson> getLessons() {
		return lessons;
	}


	/**
	 * @param lessons the lessons to set
	 */
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	
}
