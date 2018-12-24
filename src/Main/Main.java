package Main;

public class Main {
	
	public static void main(String[] args) {
		PlayersDB playersDB = new PlayersDB();
		MemoryDatabaseManager databaseManager = new MemoryDatabaseManager();
		
		databaseManager.setDb(playersDB);
		
		InteractionManager interactionManager = new InteractionManager();
		interactionManager.userInteraction();
		
		System.out.println("before - " + databaseManager.getPlayersNumber());
		databaseManager.addPlayer(new Player());
		databaseManager.addPlayer(new Player());
		System.out.println("after adding - " + databaseManager.getPlayersNumber());
		databaseManager.removePlayer(3);
		System.out.println("after removing - " + databaseManager.getPlayersNumber());
		
	}
	
	
}
