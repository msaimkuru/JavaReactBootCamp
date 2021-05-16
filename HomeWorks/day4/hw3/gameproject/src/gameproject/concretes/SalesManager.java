package gameproject.concretes;

import gameproject.abstracts.ISalesService;
import gameproject.entities.Campaign;
import gameproject.entities.Game;
import gameproject.entities.Gamer;

public class SalesManager implements ISalesService {
	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName() + " has purchased :"
				+ game.getGameName() + "." + "Cost:" + game.getUnitPrice());
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName() + " has purchased :"
				+ game.getGameName() + " with campaign: " + campaign.getCampaignName() + "." + "Cost:"
				+ game.getUnitPrice() * (100 - campaign.getcampaignDiscountPercentage()) / 100.0);
	}
}