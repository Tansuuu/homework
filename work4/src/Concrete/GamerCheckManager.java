package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("Kullan�c� do�ruland� : " + gamer.getFirstName());
		return true;
	}

}
