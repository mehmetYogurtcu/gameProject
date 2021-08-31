
import abstracts.PlayerCheckService;
import abstracts.PlayerService;
import adapters.MernisServiseAdapter;
import concretes.GameSaleManager;
import concretes.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Player player = new Player(1, "mehmet", "yoğurtcu", LocalDate.of(2000, 05, 12), "11111111111");
        Game game = new Game(1, "pubg", 80);
        Campaign campaign = new Campaign(1,"bayram indirimi",10);

        PlayerService playerService = new PlayerManager(new MernisServiseAdapter());
        playerService.add(player);



        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.sall(game,player,campaign);





    }
}
