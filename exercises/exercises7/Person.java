package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
public class Person {
	
	/**
	 * instance variables
	 */
	private int height, age;
	
	/**
	 * constructor
	 * @param height
	 */
	public Person(int height) { 
		this.height = height;
		this.age    = 0;
	}
	
	/**
	 * Mutator
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Other (increases the age of the person by 1)
	 */
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	/**
	 * Accessor
	 * @return
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Accessor
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	

}
