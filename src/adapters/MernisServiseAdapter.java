package adapters;

import abstracts.PlayerCheckService;
import entities.Player;
import mernisService.BLAKPSPublicSoap;


public class MernisServiseAdapter implements PlayerCheckService {

    BLAKPSPublicSoap clint = new BLAKPSPublicSoap();


    @Override
    public boolean checkIfRealPerson(Player player) {
        try {
            return clint.TCKimlikNoDogrula(Long.valueOf(player.getNationaltyId()),player.getFirstName().toUpperCase(),
                    player.getLastName().toUpperCase(),player.getBirthOfDate().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
