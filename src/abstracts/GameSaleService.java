package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Player;

public interface GameSaleService {
    void sall(Game game, Player player, Campaign campaign);
}
