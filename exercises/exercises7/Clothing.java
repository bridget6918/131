package exercises7;

public class Clothing {
	
	// has a
	// brand String
	// size int
	// price double
	
	private String brand;
	private int size;
	private double price;
	private int personSize;

	public Clothing(String brand, int size, double price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.personSize = 0;
	}

	public int getSize() {
		return size;
	}
	
	public void fit() {
		this.personSize += 1;
	}

	public int getPersonSize() {
		return personSize;
	}

}
