package Main;

import java.util.ArrayList;

public interface DatabaseManager {

	void addPlayer(Player player);
	void removePlayer(int number);
	ArrayList<Player> getAllPlayers();
	int getPlayersNumber();
}
