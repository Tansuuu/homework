package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		if(gamer.getNationalityId().length() == 11) {
			return true;
		}else {
			return false;
		}
	}

}
