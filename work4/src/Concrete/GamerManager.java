package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			super.add(gamer);
			System.out.println("Ge�erli ki�i.");
		}else {
			System.out.println("Ge�ersiz : " + gamer.getFirstName());
		}
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kay�d�n�z silindi : " + gamer.getFirstName());
	}

	@Override
	public void upDate(Gamer gamer) {
		System.out.println("G�ncellendi : " + gamer.getFirstName());
	}
}
