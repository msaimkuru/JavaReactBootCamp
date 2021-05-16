package gameproject.entities;

import gameproject.abstracts.IEntity;

public class Campaign implements IEntity {
	private int id;
	private String campaignName;
	private String campaignDescription;
	private double campaignDiscountPercentage;

	public Campaign() {
	}

	public Campaign(int id, String campaignName, String campaignDescription, double campaignDiscountPercentage) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDescription = campaignDescription;
		this.campaignDiscountPercentage = campaignDiscountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getcampaignDescription() {
		return campaignDescription;
	}

	public void setcampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

	public double getcampaignDiscountPercentage() {
		return campaignDiscountPercentage;
	}

	public void setcampaignDiscountPercentage(double campaignDiscountPercentage) {
		this.campaignDiscountPercentage = campaignDiscountPercentage;
	}
}