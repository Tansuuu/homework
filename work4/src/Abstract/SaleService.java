package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	
	void sale(Game game, Gamer gamer);
	
	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);

}
