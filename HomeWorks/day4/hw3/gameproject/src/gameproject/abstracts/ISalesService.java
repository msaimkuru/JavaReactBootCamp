package gameproject.abstracts;

import gameproject.entities.Campaign;
import gameproject.entities.Game;
import gameproject.entities.Gamer;

public interface ISalesService {
	void sale(Game game, Gamer gamer);

	void campaignSale(Game game, Gamer gamer, Campaign campaign);
}