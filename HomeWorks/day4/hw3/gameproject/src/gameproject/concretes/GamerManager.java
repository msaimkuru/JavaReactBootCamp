package gameproject.concretes;

import gameproject.abstracts.IGamerCheckService;
import gameproject.abstracts.IGamerService;
import gameproject.entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IGamerCheckService iGamerCheckService;
	
	public GamerManager(IGamerCheckService iGamerCheckService) {
		this.iGamerCheckService = iGamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (iGamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Valid User: " + gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName());			
		} 
		
		else {
			System.out.println("Not a valid user: " + gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName());
		}
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("User removed: " + gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println("User deleted: " + gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName());
	}
}