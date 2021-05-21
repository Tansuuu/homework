package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Oyunun adý : " + game.getName() + "," + " Satýn alan oyuncu : " + gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Oyunun adý : " + game.getName() + "," + " Ýndirim oraný %:" + campaign.getDiscount() + "," +" Satýn alan oyuncu : " + gamer.getFirstName());
		
	}

}
