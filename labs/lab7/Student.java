package lab7;

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
	 * @param ID unique student ID
	 * @param credits number of credits
	 * @param GPA GPA of the student
	 */
	public Student(String fname, String lname, int ID) {
		this.fname = fname;
		this.lname = lname;
		this.ID = ID;
		this.credits = credits;
		this.GPA = GPA;
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
	 * @param grade grade for the course
	 * @param credits credits for the course3333
	 */
	public void submitGrade (double grade, int credits) {
		this.credits = this.credits + credits;
		gpatotal = gpatotal + grade*credits;
		this.GPA = ((int)(gpatotal*1000.0) / this.credits)/1000.0;
	}
	
	public String toString() {
		return fname + lname + ID;
	}
	
}