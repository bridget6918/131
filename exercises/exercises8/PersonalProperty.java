package exercises8;

public class PersonalProperty implements Valuable {

	private final int iniVal;
	private 	  int year;
	
	public PersonalProperty(int iniVal) {
		this.iniVal = iniVal;
	}

	public int depreciateValua() {
		return (int) (this.iniVal*Math.pow(0.8, year));
	}

	public void yearOlder() {
		this.year = this.year + 1;
	}
	
	public String toString() {
		return "Initial Value: " + this.iniVal + " current value " + this.depreciateValua();
	}
	
	@Override
	public int getLiquidValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
