package Abstract;

import Entities.Gamer;

public class BaseGamerManager implements GamerService{

	public void add(Gamer gamer) {
		System.out.println("Kay�t oldunuz! : " + gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Kay�d�n�z silindi : " + gamer.getFirstName());
	}

	public void upDate(Gamer gamer) {
		System.out.println("G�ncellendi : " + gamer.getFirstName());
	}
}
