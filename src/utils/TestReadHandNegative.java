package utils;

import model.Hand;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 29.09.2016.
 */
public class TestReadHandNegative {
    public static void main(String[] args) {
        int playercount = 0;
        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand = new HashSet<>();
        try {
            readerHand.read("resources/test.txt");
            resultHand = readerHand.getHandSet();
            for (Hand parts : resultHand) {
                System.out.println(parts.getBody());
                System.out.println("______________________________________________________" + "\n");
                System.out.println("______________________________________________________" + "\n");
                System.out.println(parts.getPreflop());
                System.out.println("______________________________________________________" + "\n");
                System.out.println("______________________________________________________" + "\n");
                System.out.println(parts.getFlop());
                System.out.println("______________________________________________________" + "\n");
                System.out.println("______________________________________________________" + "\n");
                System.out.println(parts.getTurn());
                System.out.println("______________________________________________________" + "\n");
                System.out.println("______________________________________________________" + "\n");
                System.out.println(parts.getRiver());
                System.out.println("______________________________________________________" + "\n");
                System.out.println("______________________________________________________" + "\n");
                System.out.println(parts.getShowdown());
                playercount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (playercount == 2) {
            System.out.println("test successful");
        }

    }

}
