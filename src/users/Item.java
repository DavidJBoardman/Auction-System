package users;

public class Item {
	private String description;
	
	public Item (String description) {
		this.description = description;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
	//http://stackoverflow.com/questions/13001427/printing-out-all-the-objects-in-array-list
	@Override
	public String toString() {
	    return "Description: " + this.getDescription();
	}
}
