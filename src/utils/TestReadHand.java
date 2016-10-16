package utils;

import model.Hand;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 28.09.2016.
 */
public class TestReadHand {
    public static void main(String[] args) {
        int k = 0;
        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand = new HashSet<>();
        try {
            readerHand.read("C:/Users/lost/Desktop/1/history/HanaJava/HH20161007 Aludra #2 - $0.05-$0.10 - USD No Limit Hold'em.txt");
            resultHand = readerHand.getHandSet();
            for (Hand parts : resultHand) {
                System.out.println(parts.getBody());
                System.out.println("______________________________________" + "\n");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (k == 1) {
            System.out.println("test successful");
        }

    }

}
