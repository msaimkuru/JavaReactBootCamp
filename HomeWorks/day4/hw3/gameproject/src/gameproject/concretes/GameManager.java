package gameproject.concretes;

import gameproject.abstracts.IGameService;
import gameproject.entities.Game;

public class GameManager implements IGameService {
	@Override
	public void addGame(Game game) {
		System.out.println("Added game: " + game.getId() + "-" + game.getGameName() + "(" + game.getUnitPrice() + "$)");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Removed game: " + game.getId() + "-" + game.getGameName());
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Updated game: " + game.getId() + "-" + game.getGameName());
	}
}