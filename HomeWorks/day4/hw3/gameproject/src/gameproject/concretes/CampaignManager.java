package gameproject.concretes;

import gameproject.abstracts.ICampaignService;
import gameproject.entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Added campaign to the system: " + campaign.getId() + "-" + campaign.getCampaignName());
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Removed campaign to the system: " + campaign.getId() + "-" + campaign.getCampaignName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Updated campaign to the system: " + campaign.getId() + "-" + campaign.getCampaignName());
	}
}