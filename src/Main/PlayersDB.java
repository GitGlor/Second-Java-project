package Main;

import java.util.ArrayList;

public class PlayersDB {
	
	ArrayList<Player> players;
	
	public PlayersDB() {
		players = new ArrayList<>();
		createPlayers();
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	void createPlayers() {
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	
	players.add(player1);
	players.add(player2);
	players.add(player3);
	}
	
}

