package auctionSystem;

import java.util.Date;

import users.Buyer;
import users.Item;

public class Auction {
	
	private double startPrice;
	private double reservePrice;
	private Date closeDate;
	private char status;
		
	public Auction(double sPrice, double rPrice, Date closeDate, char status) {
		this.startPrice = sPrice; this.reservePrice = rPrice; this.closeDate = closeDate; this.status = status;
	}
	public Auction(double sPrice, double rPrice, char status) {
		this.startPrice = sPrice; this.reservePrice = rPrice;  this.status = status;
	}
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

	//when you place a bid you need to add the bid 
	//object to the array of all bids placed on the item
	public void placeBid(int amt, Buyer who, Date when) {
		
	}
	
	//Seller must verify the auction before they start
	public void verify() {
		//If they user chooses to verify then start the auction and post it to listings
		//if the user doesn't verify then the auction is discarded
	}
	
	//Close the auction so that bids can no longer be accepted
	public void close() {
		//if the auction is closed and item has no bids then close it after time
		//if the auction has closed and there are bids on it notify the highest bidder (Buyer.Victory)
	}
	
	public void isBlocked(boolean blocked) {
		//Both sellers and auctions may be temporarily blocked which 
		//prevents the sellers from logging on or the auctions 
		//from being browsed or bid upon respectively.
		
		//cannot Bid/Cannot browse
	}

	//Sets the auction to blocked so that it can no longer be bid on or viewed
	public void setBlocked() {
	}
}
