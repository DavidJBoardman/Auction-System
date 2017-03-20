package auctionSystem;

public class BasicTime {
private int hour, minute, second;

    public BasicTime(){

    }
      public void setTime(int hour, int minute, int second){
	        if(hour >= 0 && hour < 24) {
	          this.hour = hour;
	        }
	        else {
	          this.hour = 0;
	        }
	        
		    if(minute >=0 && minute < 60) {
		   	 this.minute = minute;
		    }
		    
		    else {
	    	 this.minute = 0;
		    }
		    
		    if(second >= 0 && second < 60) {
		    	this.second = second;
		    }
		    else {
		    	this.second = 0;
		    }
     }

    @Override
    public String toString() {
     return String.format("%0.2d:%02d:%02d, hour minute second");
    }
}

