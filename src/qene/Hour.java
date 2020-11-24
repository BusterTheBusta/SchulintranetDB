/**
 * 
 */
package qene;

import java.sql.Time;

import annotations.Table;
import orm.Entity;

/**
 * @author kaan.inis
 *
 */
@Table(name = "hour")
public class Hour extends Entity<Hour> {
	
	int number;
	Time begin;
	Time end;
	
	public Hour() {
		super();
	}

	/**
	 * @param number
	 * @param begin
	 * @param end
	 */
	public Hour(int number, Time begin, Time end) {
		super();
		this.number = number;
		this.begin = begin;
		this.end = end;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the begin
	 */
	public Time getBegin() {
		return begin;
	}

	/**
	 * @param begin the begin to set
	 */
	public void setBegin(Time begin) {
		this.begin = begin;
	}

	/**
	 * @return the end
	 */
	public Time getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Time end) {
		this.end = end;
	}
	

}
