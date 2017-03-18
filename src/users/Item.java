package users;

public class Item {
	
	private String name;
	private String description;
	private Integer startPrice;
	private Integer reservePrice;
	public Item (String name, String description, int startPrice, int reservePrice) {
		this.name = name;
		this.description = description;
		this.startPrice = startPrice;
		this.reservePrice = reservePrice;
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

	public Integer getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}

	public Integer getReservePrice() {
		return reservePrice;
	}

	public void setReservePrice(Integer reservePrice) {
		this.reservePrice = reservePrice;
	}

	//http://stackoverflow.com/questions/13001427/printing-out-all-the-objects-in-array-list
	@Override
	public String toString() {
	    return "Description: " + this.getDescription() + "Name: " + this.getName() + "Start Price: " + this.getStartPrice() + "Reserve Price: " + this.getReservePrice();

	}
}
