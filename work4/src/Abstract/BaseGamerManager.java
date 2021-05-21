package Abstract;

import Entities.Gamer;

public class BaseGamerManager implements GamerService{

	public void add(Gamer gamer) {
		System.out.println("Kayýt oldunuz! : " + gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Kayýdýnýz silindi : " + gamer.getFirstName());
	}

	public void upDate(Gamer gamer) {
		System.out.println("Güncellendi : " + gamer.getFirstName());
	}
}
