package work4;

import java.time.LocalDate;

import Abstract.BaseGamerManager;
import Adapters.EDevletServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer ("Tansu", "Tekin", LocalDate.of(1997, 1, 30), "11111111111");
		Gamer gamer2 = new Gamer ("Hande", "Yýlmaz", LocalDate.of(1997, 7, 05), "2222222222");
		
		BaseGamerManager gamerManager = new GamerManager(new EDevletServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		
		System.out.println("-----------------------------------------");
		
		Game lol = new Game ("League of Legends","Strateji oyunu", 50, 5);
		Game cs = new Game ("Counter-Strike", "Aksiyon oyunu", 100, 10);
		
		GameManager gameManager = new GameManager();
		gameManager.add(gamer1);
		gameManager.delete(gamer2);
		
		Game[] games = {lol, cs};
		for(Game game: games) {
			System.out.println(game.getName());
		}
		
		System.out.println("------------------------------------");
		
		
		Campaign campaign1 = new Campaign("Anneler Günü Kampanyasý", 25);
		Campaign campaign2 = new Campaign("19 Mayýs Kampanyasý", 30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.upDate(campaign2);
		
		System.out.println("------------------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(lol, gamer1);
		saleManager.saleWithCampaign(cs, gamer2, campaign2);
	
	}

}
