package gameproject;

import java.time.LocalDate;

import gameproject.abstracts.ICampaignService;
import gameproject.abstracts.IGameService;
import gameproject.abstracts.IGamerService;
import gameproject.abstracts.ISalesService;
//import gameproject.adapters.MernisServiceAdapter;
import gameproject.concretes.CampaignManager;
import gameproject.concretes.GameManager;
import gameproject.concretes.GamerManager;
import gameproject.concretes.GamerCheckManager;
import gameproject.concretes.SalesManager;
import gameproject.entities.Game;
import gameproject.entities.Gamer;
import gameproject.entities.Campaign;

public class Main {
	public static void main(String[] args) {
		// Create and add a game to the system
		IGameService iGameService = new GameManager();
		Game game1 = new Game(1, "Super Mario", 5);
		iGameService.addGame(game1);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Define and add a campaign to the system
		ICampaignService iCampaignService = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "Festival Campaign", "This offer is for all national fests", 25);
		iCampaignService.addCampaign(campaign1);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Add and update gamers
		IGamerService iGamerService = new GamerManager(new /* MernisServiceAdapter() */GamerCheckManager());
		Gamer gamer1 = new Gamer(1, "avelioglu", "Ali", "Velioğlu", LocalDate.of(1996, 1, 1), "10304093054");
		Gamer gamer2 = new Gamer(2, "ymeyveci", "Yeşim", "Meyveci", LocalDate.of(1990, 5, 5), "10304093055");
		Gamer gamer3 = new Gamer(3, "zyagmur", "Zeynep", "Yağmur", LocalDate.of(2000, 3, 1), "10304093056");
		Gamer gamer4 = new Gamer(4, "mkoroglu", "Mert", "Köroğlu", LocalDate.of(2000, 9, 1), "10304093056");

		iGamerService.addGamer(gamer1);
		iGamerService.addGamer(gamer2);
		iGamerService.addGamer(gamer3);
		iGamerService.addGamer(gamer4);
		
		// update gamer2, here gamer2 is supposed to be a valid user.
		gamer2.setNationalityId("10304093057");
		iGamerService.updateGamer(gamer2);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// sale examples with and without a campaign
		ISalesService iSalesService = new SalesManager();
		iSalesService.sale(game1, gamer4);
		iSalesService.campaignSale(game1, gamer1, campaign1);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// delete gamer3, here gamer3 is supposed to be a valid user.
		iGamerService.deleteGamer(gamer3);
	}
}