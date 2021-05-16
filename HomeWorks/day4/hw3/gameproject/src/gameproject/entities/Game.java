package gameproject.entities;

import gameproject.abstracts.IEntity;

public class Game implements IEntity {
	private int id;
	private String gameName;
	private double unitPrice;
	//private Campaign campaign;

	public Game(int id, String gameName, double unitPrice) {
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/*public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
		this.setUnitPrice(unitPrice * (100 - campaign.getcampaignDiscountPercentage()) / 100.0);
		System.out.println("After applying campaign the unit price is now: " + this.getUnitPrice());
	}*/

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}