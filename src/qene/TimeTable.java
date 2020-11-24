/**
 * 
 */
package qene;

import java.sql.Date;
import java.util.List;

import annotations.OneToMany;
import annotations.OneToOne;
import annotations.Table;
import annotations.ToString;
import orm.Entity;

/**
 * @author kaan.inis
 *
 */
@ToString
@Table(name = "timetable")
public class TimeTable extends Entity<TimeTable> {

	@OneToMany(referenceTable = Day.class)
	List<Day>days;
	
	@OneToOne(referenceTable = SchoolClass.class)
	SchoolClass schoolClass;
	
	Date date;
	
	public TimeTable() {
		super();
	}

	/**
	 * @param days
	 * @param schoolClass
	 * @param kw
	 */
	public TimeTable(List<Day> days, SchoolClass schoolClass, Date date) {
		super();
		this.days = days;
		this.schoolClass = schoolClass;
		this.date = date;
	}

	/**
	 * @return the days
	 */
	public List<Day> getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(List<Day> days) {
		this.days = days;
	}

	/**
	 * @return the schoolClass
	 */
	public SchoolClass getSchoolClass() {
		return schoolClass;
	}

	/**
	 * @param schoolClass the schoolClass to set
	 */
	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

	/**
	 * @return the kw
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
}
