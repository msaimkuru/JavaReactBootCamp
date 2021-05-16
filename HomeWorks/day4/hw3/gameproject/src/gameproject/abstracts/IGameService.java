package gameproject.abstracts;

import gameproject.entities.Game;

public interface IGameService {
	void addGame(Game game);

	void deleteGame(Game game);

	void updateGame(Game game);
}