package gameproject.abstracts;

import gameproject.entities.Gamer;

public interface IGamerService {
	void addGamer(Gamer gamer);

	void deleteGamer(Gamer gamer);

	void updateGamer(Gamer gamer);
}