package auctionSystem;

import users.Item;
import users.User;

public final class AuctionDatabase {
	private User[] arrayUsers;
	private Item[] arrayItems;

    public AuctionDatabase() {
        arrayItems = new Item[4];

        arrayItems[0] = new Item("Swimming pool");
        arrayItems[1] = new Item("New £1 coin");
        arrayItems[2] = new Item("Watch");
        arrayItems[3] = new Item("Iphone");
    }

    
    
    public Item[] getArrayItems(){
    	return arrayItems;
    }
}
