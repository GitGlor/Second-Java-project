package Main;

public class Player {
	String username;
	String password;
	int highscore;
	int uid;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getHighscore() {
		return highscore;
	}
	
	public int getUid() {
		return uid;
	}
}
