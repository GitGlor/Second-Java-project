package Main;

import java.util.ArrayList;

public class MemoryDatabaseManager implements DatabaseManager {
	
	private PlayersDB db;
	
	public void setDb(PlayersDB db) {
			this.db = new PlayersDB();
		}

	@Override
	public void addPlayer(Player player) {
		db.getPlayers().add(player);
	}

	@Override
	public ArrayList<Player> getAllPlayers() {
		return db.getPlayers();
	}

	@Override
	public int getPlayersNumber() {
		
		return db.getPlayers().size();
	}
	
	@Override
	public void removePlayer(int number) {
		db.getPlayers().remove(number);
	}
	
	

}
