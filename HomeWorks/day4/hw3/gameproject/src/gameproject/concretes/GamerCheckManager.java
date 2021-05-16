package gameproject.concretes;

import java.util.Random;

import gameproject.abstracts.IGamerCheckService;
import gameproject.entities.Gamer;

/*
 * This class simulates a Gamer Checking Service in a random manner.
 * We can use this class for demonstration purposes instead of using
 * a MernisServiceAdapter class.
 */
public class GamerCheckManager implements IGamerCheckService{
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		Random r = new Random();
		return r.nextInt(2) == 0 ? true : false;
	}
}