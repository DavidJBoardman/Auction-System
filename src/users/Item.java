package users;

public class Item {
	private String description;
	
	public Item (String description) {
		this.description = description;
	}
	
	//Returns the description
	public String getDescription() {
		return description;
	}
	
    // Sets the Description of the item
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
