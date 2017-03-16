package users;

public abstract class User {
	protected String username;
	protected String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Boolean checkPassword(String userPassword) { 
		if (password.equals(userPassword)){
            return true;
        }
        else {
            return false;
        }
	}

	
	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	private String getPassword() {
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
