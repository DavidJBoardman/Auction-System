package auctionSystem;

import java.util.Date;

import users.Buyer;
import users.Item;

public class Auction {
	
	private double startPrice;
	private double reservePrice;
	private Date closeDate;
	private char status;
	
	
	Bid bid = new Bid();
	
	
	private double getStartPrice() {
		return startPrice;
	}

	private void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}

	private double getReservePrice() {
		return reservePrice;
	}

	private void setReservePrice(double reservePrice) {
		this.reservePrice = reservePrice;
	}

	private Date getCloseDate() {
		return closeDate;
	}

	private void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	private char getStatus() {
		return status;
	}

	private void setStatus(char status) {
		this.status = status;
	}

	public void placeBid(int amt, Buyer who, Date when) {
		//when you place a bid you need to add the bid 
		//object to the array of all bids placed on the item
	}
	
	public void verify() {
		
	}
	
	public void close() {
		
	}
	
	public void isBlocked(boolean blocked) {
		
	}
	
	public void setBlocked() {
		
	}
}
