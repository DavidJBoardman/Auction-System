package auctionSystem;

import java.util.Date;

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

	public void placeBid() {
		
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
