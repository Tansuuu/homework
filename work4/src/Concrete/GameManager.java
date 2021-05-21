package Concrete;

import Abstract.GameService;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Yeni oyun eklendi. Kullan�c� : " + gamer.getFirstName());
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyun silindi. Kullan�c� : " + gamer.getFirstName());
	}
	
	@Override
	public void upDate(Gamer gamer) {
		System.out.println("Oyun g�ncellendi. Kullan�c� : " + gamer.getFirstName());
	}
}
