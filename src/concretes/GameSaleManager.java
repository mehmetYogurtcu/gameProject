package concretes;

import abstracts.GameSaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class GameSaleManager implements GameSaleService {
    @Override
    public void sall(Game game, Player player, Campaign campaign) {

        double lastPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);

        System.out.println(player.getFirstName() + " adlı oyuncuya " + game.getPrice() + " tutarındaki " +
                game.getGameName() + " adlı oyun " + campaign.getCampaignName() +  " adlı kampanya ile %" +
                campaign.getDiscount() +  " indirim uygulanmış " + lastPrice + " fiyatına satılmıştır. ");


    }
}
