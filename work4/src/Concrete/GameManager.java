package Concrete;

import Abstract.GameService;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Yeni oyun eklendi. Kullanıcı : " + gamer.getFirstName());
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyun silindi. Kullanıcı : " + gamer.getFirstName());
	}
	
	@Override
	public void upDate(Gamer gamer) {
		System.out.println("Oyun güncellendi. Kullanıcı : " + gamer.getFirstName());
	}
}
