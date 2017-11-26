//Object data for registrant
public class registrant {
	
	//Constructor
	public registrant(String name, int priority){
		this.name = name;
		this.priority = priority;
		order = -1;
	}
	
	
	// Accessor methods
	public String get_name() {
		return name;
	}
	public int get_order() {
		return order;
	}
	public int get_priority() {
		return priority;
	}
	
	
	// Necessary mutator methods
	public void set_order(int ord) {
		order = ord; //order = index in the initial list.
	}
	
	// Print out data
	public String toString() {
		return name + " has " + priority + " priority.";
	}

	private String name;
	private int priority;
	private int order;
}
