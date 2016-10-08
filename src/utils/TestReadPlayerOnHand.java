package utils;

import model.Hand;
import model.Player;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 04.10.2016.
 */
public class TestReadPlayerOnHand {
    public static void main(String[] args) {
        int k=0;
        Player [] players = new Player[10];
        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand= new HashSet<>();
        try {
            readerHand.read("C:\\Users\\lost\\Desktop\\History\\Eminence_Gru\\test.txt");
            resultHand=readerHand.getHandSet();
            for (Hand parts:resultHand) {
                System.out.println(parts.getBody());
                System.out.println("______________________________________________________"+"\n");
                System.out.println("______________________________________________________"+"\n");
                System.out.println(parts.getPreflop());
                System.out.println("______________________________________________________"+"\n");
                System.out.println("______________________________________________________"+"\n");
                System.out.println(parts.getFlop());
                System.out.println("______________________________________________________"+"\n");
                System.out.println("______________________________________________________"+"\n");
                System.out.println(parts.getTurn());
                System.out.println("______________________________________________________"+"\n");
                System.out.println("______________________________________________________"+"\n");
                System.out.println(parts.getRiver());
                System.out.println("______________________________________________________"+"\n");
                System.out.println("______________________________________________________"+"\n");
                System.out.println(parts.getShowdown());
                System.out.println(parts.getShowdown());
                k++;
                players=parts.getPlayers();
                for (int d=0; d<6; d++){
                    System.out.println(players[d].toString());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (k==1){
            System.out.println("test successful");
        }




    }
}
