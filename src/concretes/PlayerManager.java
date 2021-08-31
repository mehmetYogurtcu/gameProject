package concretes;

import abstracts.PlayerCheckService;
import abstracts.PlayerService;
import entities.Player;

public class PlayerManager implements PlayerService {

    private PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void add(Player player) {
        if (playerCheckService.checkIfRealPerson(player)){
            System.out.println("Oyuncu eklendi: " + player.getFirstName());
        }else {
            System.out.println("Hatalı bilgi girişi nedeni ile kişi eklenemedi");
        }

    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi: " + player.getFirstName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi: " + player.getFirstName());
    }
}
