package lab7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Student {

	private String fname;
	private String lname;
	private int ID;
	private int credits;
	private double GPA;
	private double gpatotal;
	
	/**
	 * 
	 * @param fname first name
	 * @param lname last name
	 * @param ID student ID
	 */
	public Student(String fname, String lname, int ID) {
		this.fname = fname;
		this.lname = lname;
		this.ID = ID;
	}
	
	/**
	 * 
	 * @param fname first name
	 * @param lname last name
	 * @param ID unique student ID
	 * @param credits number of credits
	 * @param GPA GPA of the student
	 */
	private Student(String fname, String lname, int ID, int credits, double GPA) {
		this.fname = fname;
		this.lname = lname;
		this.ID = ID;
		this.credits = credits;
		this.GPA = GPA;
	}

	
	/**
	 * 
	 * @param otherParent other student as the other parent
	 * @return the baby (fname, lname, ID, GPA, credits)
	 */
	public Student createLegacy(Student otherParent) {
		String babyFName = this.getName();
		String babyLName = otherParent.getName();
		int babyID = this.getStudentID() + otherParent.getStudentID();
		int babyCredits = Math.max(this.getCredits(), otherParent.getCredits());
		double babyGPA = (this.getGPA() + otherParent.getGPA())/2;
		
		Student baby = new Student(babyFName, babyLName, babyID, babyCredits, babyGPA);
		return baby;
	}
	
	public String getName() {
		return fname + " " + lname;
	}

	public int getStudentID() {
		return ID;
	}

	public int getCredits() {
		return credits;
	}

	public double getGPA() {
		return GPA;
	}

	public String getClassStanding() {
		if (credits < 30) {
			return "FirstYear";
		}
		else if (credits < 60) {
			return "Sophomore";
		}
		else if (credits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}

	/**
	 * 
	 * @param g grade for the course
	 * @param c credits for the course
	 */
	public double submitGrade (double g, int c) {
		this.credits = this.credits + c;
		this.gpatotal = gpatotal + g*c;
		this.GPA = Math.round((gpatotal*1000.0) / credits)/1000.0;
		return this.GPA;
	}
	
	public String toString() {
		return fname + lname + ID;
	}
}