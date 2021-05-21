package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Oyunun ad� : " + game.getName() + "," + " Sat�n alan oyuncu : " + gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Oyunun ad� : " + game.getName() + "," + " �ndirim oran� %:" + campaign.getDiscount() + "," +" Sat�n alan oyuncu : " + gamer.getFirstName());
		
	}

}
