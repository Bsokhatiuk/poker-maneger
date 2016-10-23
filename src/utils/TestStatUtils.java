package utils;

import dao.PlayerContainers;
import model.Constants;
import model.Hand;
import model.Player;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 08.10.2016.
 */
public class TestStatUtils {

    public static void main(String[] args) {
        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand= new HashSet<>();
        Set<String> playersName;
        Player player;

        PlayerContainers playerContainers= new PlayerContainers();
        StatUtils statUtils=new StatUtils(playerContainers);
        try {
            readerHand.read("resources/test.txt");
            resultHand=readerHand.getHandSet();
            for (Hand parts:resultHand) {
                statUtils.parseHand(parts);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        playerContainers=statUtils.getPlayerContainers();
        playersName=playerContainers.getAllPlayer();
        for (String name:playersName) {
            player=playerContainers.getPlayer(name);
            System.out.println(player.getName()+"{");
            System.out.println("Total= "+player.getStats().getStats(player.getStats().getTotalStats()));
            System.out.println("}\n");

        }
    }
}
