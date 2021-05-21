package Concrete;

import Abstract.GameService;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Yeni oyun eklendi. Kullanýcý : " + gamer.getFirstName());
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyun silindi. Kullanýcý : " + gamer.getFirstName());
	}
	
	@Override
	public void upDate(Gamer gamer) {
		System.out.println("Oyun güncellendi. Kullanýcý : " + gamer.getFirstName());
	}
}
