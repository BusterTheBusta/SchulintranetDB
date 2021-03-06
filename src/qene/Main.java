/**
 * 
 */
package qene;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import orm.Orm;

/**
 * @author kaan.inis
 *
 */
public class Main {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Subject prg = new Subject("Prg", "Programmieren");
		 Subject wfmd = new Subject("WF_MD", "Photoshop");
		 Subject ep = new Subject("EP", "Elektro-Prozesstechnik");
		
		 Teacher ti = new Teacher(Arrays.asList(prg),"Tikko");
		 Teacher goi = new Teacher(Arrays.asList(ep),"Giovinazzo");
		 Teacher ro = new Teacher(Arrays.asList(wfmd),"Rosenthatl");
		
		 Room b207 = new Room("B207", 30, true);
		
		 SchoolClass ita58 = new SchoolClass("ita58", Arrays.asList(ro, goi));
		 List<Hour> hours = Arrays.asList(
				new Hour(1, Time.valueOf(LocalTime.of(8, 30)), Time.valueOf(LocalTime.of(9, 15))),
				new Hour(2, Time.valueOf(LocalTime.of(9, 20)), Time.valueOf(LocalTime.of(10, 5))),
				new Hour(3, Time.valueOf(LocalTime.of(10, 15)), Time.valueOf(LocalTime.of(11, 0))),
				new Hour(4, Time.valueOf(LocalTime.of(11, 5)), Time.valueOf(LocalTime.of(11, 50))),
				new Hour(5, Time.valueOf(LocalTime.of(12, 0)), Time.valueOf(LocalTime.of(12, 45))),
				new Hour(6, Time.valueOf(LocalTime.of(12, 45)), Time.valueOf(LocalTime.of(13, 30))),
				new Hour(7, Time.valueOf(LocalTime.of(13, 30)), Time.valueOf(LocalTime.of(14, 15))),
				new Hour(8, Time.valueOf(LocalTime.of(14, 20)), Time.valueOf(LocalTime.of(15, 5))),
				new Hour(9, Time.valueOf(LocalTime.of(15, 15)), Time.valueOf(LocalTime.of(16, 0))),
				new Hour(10, Time.valueOf(LocalTime.of(16, 5)), Time.valueOf(LocalTime.of(16, 50))));
		
		  List<Lesson> lessons = Arrays.asList(new Lesson(
						   wfmd, b207, ro, null, hours.get(0)),
				new Lesson(wfmd, b207, ro, null, hours.get(1)),
				new Lesson(wfmd, b207, ro, null, hours.get(2)),
				new Lesson(ep, b207, goi, null, hours.get(3)),
				new Lesson(ep, b207, goi, null, hours.get(4)),
				new Lesson(ep, b207, goi, null, hours.get(5)),
				new Lesson(null, null, null, "Mittagspause", hours.get(6)),
				new Lesson(prg, b207, ti, null, hours.get(7)),
				new Lesson(prg, b207, ti, null, hours.get(8)),
				new Lesson(prg, b207, ti, null, hours.get(9)));
		  
	    Date date = Date.valueOf("2020-11-16");	
		Day mon = new Day(lessons,date);
		List<Day> days = Arrays.asList(mon);
		
		
		
		TimeTable t = new TimeTable(days, ita58, date );
//		System.out.println(t);
		
		Orm.initDb("localhost", "root", "","dummy");
		Orm.initTables(Day.class,Hour.class,Lesson.class,Room.class,SchoolClass.class,Subject.class,Teacher.class,TimeTable.class);
		t.save();
		
		System.out.println(Orm.selectAll(TimeTable.class));
	}

}
