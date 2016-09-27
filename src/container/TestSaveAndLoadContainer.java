package container;

import model.Hand;
import model.Player;
import utils.ContainerUtils;
import utils.IOutils;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by lost on 27.09.2016.
 */
public class TestSaveAndLoadContainer {
    public static void main(String[] args) {
        Player player1 = new Player("Andry");
        Player player2 = new Player("Back");
        Player player3 = new Player("Call");
        Player player4 = new Player("Send");
        Player player5 = new Player("Dady");
        PlayerContainers playerContainers = new PlayerContainers();

        playerContainers.addPlayer(player1);
        playerContainers.addPlayer(player2);
        playerContainers.addPlayer(player3);
        playerContainers.addPlayer(player4);
        playerContainers.addPlayer(player5);


        ContainerUtils<String> containerUtils =new ContainerUtils();
        containerUtils.saveContainertoFale((HashMap) playerContainers.getPlayerMap(),
                "C:\\Users\\lost\\Desktop\\exp\\newdatabasse.txt");


    }
}
