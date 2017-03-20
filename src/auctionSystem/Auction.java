package auctionSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Auction {
	 
    private double startPrice;
    private double currentPrice;
    private double reservePrice;
    private Date sDate;
    private Date eDate;
    private char status;
        
    public Auction(double startPrice, double currentPrice, double reservePrice, Date sDate, Date eDate, char status) {
        this.startPrice = startPrice; 
        this.currentPrice = currentPrice; 
        this.reservePrice = reservePrice; 
        this.sDate = sDate; 
        this.eDate = eDate; 
        this.status = status;
    }
    
    
	private double getCurrentPrice() {
		return currentPrice;
	}


	private void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}


	private Date getsDate() {
		return sDate;
	}


	private void setsDate(Date sDate) {
		this.sDate = sDate;
	}


	private Date geteDate() {
		return eDate;
	}


	private void seteDate(Date eDate) {
		this.eDate = eDate;
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
	
	public void formatDate() {
		Date date = new Date();
		DateFormat dformat = new SimpleDateFormat("DD-MMM-YYYY");
		String todate = dformat.format(date);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +7);
		Date date1 = cal.getTime();
		String fromdate = dformat.format(date1);
		seteDate(date1);
	}
}
