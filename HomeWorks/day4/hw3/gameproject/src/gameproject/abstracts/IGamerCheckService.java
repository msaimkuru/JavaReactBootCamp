package gameproject.abstracts;

import gameproject.entities.Gamer;

public interface IGamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}