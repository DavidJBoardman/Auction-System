package auctionSystem;

import java.util.Date;

public class Bid {
	private double amount;
	private Buyer who;
	private Date when;
	
	public void bid (int amt, Buyer who, Date when) {
		this.amount = amt;
		this.who = who;
		this.when = when;
	}
}
