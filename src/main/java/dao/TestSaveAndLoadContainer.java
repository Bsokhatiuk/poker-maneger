package java.dao;

import java.model.Player;
import java.utils.ContainerUtils;

import java.io.File;
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


        ContainerUtils containerUtils =new ContainerUtils();
        containerUtils.saveContainertoFale((HashMap) playerContainers.getPlayerMap(),
                "resources/newdatabasse.txt");
        File file=new File("resources/newdatabasse.txt");

        FileHandsContainers fileHandsContainers=new FileHandsContainers();
        fileHandsContainers.add(file);
        containerUtils.saveContainertoFale((HashMap)fileHandsContainers.getFileMap(),"resources/newdatabasse.txt");


    }
}
