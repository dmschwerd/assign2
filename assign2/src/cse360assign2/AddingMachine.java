package cse360assign2;

public class AddingMachine {

	private int total;
	private String allOps = "0";
	
	public AddingMachine () {
		total = 0;
		// not needed - included for clarity
		}
	
	//gets the total
	public int getTotal () {
		return total;
	}
	
	//adds to the total
	public void add (int value) {
		total = total + value;
		allOps = allOps + " + " + value;
	}
	
	//subtracts from the total
	public void subtract (int value) {
		total = total - value;
		allOps = allOps + " - " + value;
	}
	
	//returns the string allOps that shows all functions done to total
	public String toString () {
		return allOps;
	}
		
	public void clear() {
		allOps = "0";
	}
}
