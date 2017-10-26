package studio7;

public class UnivCourse {

	private int num;
	private String dep;
	private int numStudent;
	private String room;
	private int roomCap;

	/**
	 * 
	 * @param num course number
	 * @param dep course department
	 * @param numStudent number of students currently in the class
	 * @param room which room is it in
	 * @param roomCap capacity of the room
	 */
	public UnivCourse(int num, String dep, int numStudent, String room, int roomCap) {
		this.numStudent = numStudent;
		this.num = num;
		this.dep = dep;
		this.room = room;
		this.roomCap = roomCap;
	}

	/**
	 * Students added the course
	 * @param added number of students joined the class
	 * @return total numbers of students now
	 */
	public int add(int added) {
		this.numStudent += added;
		return this.numStudent;
	}

	/**
	 * Students dropped the course
	 * @param dropped number of students left the class
	 * @return total number of students now
	 */
	public int drop(int dropped) {
		this.numStudent = this.numStudent - dropped;
		return this.numStudent;
	}

	public int getNumStudent() {
		return this.numStudent;
	}

	public String toString() {
		return dep + num + " in room " + room + " has " + this.numStudent+ " students";
	}

	public static void main(String[] args) {
		UnivCourse c1 = new UnivCourse(131, "CSE", 5, "UR 214", 40);
		c1.add(40);
		c1.drop(3);
		System.out.println(c1);
		if (c1.roomCap < c1.getNumStudent()) {
			System.out.println(c1.room + " cannot fit all the students");
		}
		else {
			System.out.println("Yes, the room " + c1.room + " fits all the students in this class");
		}
	}
}
