package utils;

import container.PlayerContainers;
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
            readerHand.read("C:/Users/lost/Desktop/1/history/HanaJava/HH20161007 Aludra #2 - $0.05-$0.10 - USD No Limit Hold'em.txt");
            resultHand=readerHand.getHandSet();
            for (Hand parts:resultHand) {
                statUtils.add(parts);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        playersName=playerContainers.getAllPlayer();
        for (String name:playersName) {
            player=playerContainers.getPlayer(name);
            System.out.println(player.getName());
            System.out.println(player.getStats().toString());
        }
    }
}
