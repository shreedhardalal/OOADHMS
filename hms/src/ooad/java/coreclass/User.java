package ooad.java.coreclass;
import ooad.java.database.*;

public class User {
	@SuppressWarnings("unused")
	private String name;					//user's name
	@SuppressWarnings("unused")
	private String username;				//user's string used for login
	private String password;				//password for
	
	public User(String name,String user_name,String password) {
		this.name = name;
		this.username = user_name;
		this.password = password;
	}
	public void UpdatePassword(String password) {
		this.password = password;
	}
	public void UpdateName(String name) {
		this.name=name;
	}
	public boolean Authenticate(String password) {
		return this.password.equals(password);
	}
}
