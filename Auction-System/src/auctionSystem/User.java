package auctionSystem;

public class User {
	protected String username;
	protected String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public User(){
		
	}
	
	public Boolean checkPassword(String userPassword) { 
		if (password.equals(userPassword)){
            return true;
        }
        else {
            return false;
        }
	}
	public Boolean checkUsername(String userusername) { 
		if (username.equals(userusername)){
            return true;
        }
        else {
            return false;
        }
	}

	
	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return ("Username: "+ this.getUsername() +
	                    " Password: " + this.getPassword());
	   }
	
	
}
