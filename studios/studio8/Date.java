package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	
	private final int month;
	private final int day;
	private final int year;
	private final boolean holiday;
	
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public boolean isEarlierThan(Date other) {
		if (this.year < other.year) {
			return true;
		}
		else if (this.year <= other.year && this.month < other.month) {
			return true;
		}
		else if (this.month <= other.month && this.day < other.day) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Date d1 = new Date(06, 13, 2009, true);
		System.out.println("d1 " + d1);
		Date d2 = new Date(06, 13, 2009, false);
		System.out.println("d2 " + d2);
		System.out.println(d1.equals(d2));
		Date d3 = new Date(12, 25, 2017, true);
		Date d4 = new Date(05, 05, 1995, false);
		Date d5 = new Date(07, 27, 1963, true);
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d4);
		list.add(d5);
		list.add(d4);
		System.out.println(list);
		// allows duplicates
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(d5);
		set.add(d4);
		set.add(d5);
		System.out.println(set);
		// no duplicates allowed
		
		System.out.println(d1.isEarlierThan(d3));
	}

}
