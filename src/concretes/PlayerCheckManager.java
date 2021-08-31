package concretes;

import abstracts.PlayerCheckService;
import entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        return true;
    }
}
