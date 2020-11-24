/**
 * 
 */
package qene;

import annotations.OneToOne;
import annotations.SqlVarchar;
import annotations.Table;
import orm.Entity;


/**
 * @author kaan.inis
 *
 */
@Table(name = "lesson")
public class Lesson extends Entity<Lesson> {
	@OneToOne(referenceTable = Subject.class)
	Subject subject;
	
	@OneToOne(referenceTable = Room.class)
	Room room;
	
	@OneToOne(referenceTable = Teacher.class)
	Teacher teacher;
	
	@OneToOne(referenceTable = Hour.class)
	Hour hour;
	
	@SqlVarchar(size = 100)
	String info;
	
	public Lesson() {
		super();
	}

	/**
	 * @param subject
	 * @param room
	 * @param teacher
	 * @param hour
	 * @param info
	 * new Lesson(wfmd, b207, ro, null, hours.get(1)),
	 */
	public Lesson(Subject subject, Room room, Teacher teacher,String info,Hour hour) {
		super();
		this.subject = subject;
		this.room = room;
		this.teacher = teacher;
		this.hour = hour;
		this.info = info;
	}

	/**
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the hour
	 */
	public Hour getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(Hour hour) {
		this.hour = hour;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
}
