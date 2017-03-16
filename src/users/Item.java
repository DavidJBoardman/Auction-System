package users;

public class Item {
	
	private String name;
	private String description;
	
	public Item (String name, String description) {
		this.name = name;
		this.description = description;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	//http://stackoverflow.com/questions/13001427/printing-out-all-the-objects-in-array-list
	@Override
	public String toString() {
	    return "Description: " + this.getDescription();
	}
}
