package users;

public abstract class User {
	protected String username;
	protected String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Boolean checkPassword(String userPassword) { 
		if (password == userPassword) {
            return true;
        }
        else {
            return false;
        }
	}
}
