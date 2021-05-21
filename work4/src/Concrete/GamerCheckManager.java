package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("Kullanýcý doðrulandý : " + gamer.getFirstName());
		return true;
	}

}
