package lab7;

import java.util.Arrays;

public class Course {

	private String name;
	private int credits;
	private int seats;
	private int enroll;
	private double sumGPA;
	private String roster;

	/**
	 * 
	 * @param name name of the course
	 * @param credits credits a student earn by taking the course
	 * @param seats number of seats remaining in the course
	 */
	public Course (String name, int credits, int seats) {
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.sumGPA = 0;
		enroll = 0;
	}

	public String getName() {
		return name;
	}

	public int getRemainingSeats() {
		return seats;
	}

	/**
	 * 
	 * @param s a student to be added into the course
	 * @return true if added and seats - 1 or false otherwise
	 */
	public boolean addStudent(Student s) {
			if (seats > 0) {
				seats--;
				enroll++;
				sumGPA = sumGPA + s.getGPA();
				roster = roster + s.getName();
				return true;
			}
			else {
				return false;
			}
	}

	public String generateRoster() {
		return roster;
	}


	public double averageGPA() {
		double averageGPA = sumGPA / enroll;
		return averageGPA;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + "]";
	}
}
