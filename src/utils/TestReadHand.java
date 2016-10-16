package utils;

import model.Constants;
import model.Hand;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 28.09.2016.
 */
public class TestReadHand {
    public static void main(String[] args) {

        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand = new HashSet<>();
        try {
            readerHand.read(Constants.FOLDER_PATH + "test.txt");
            resultHand = readerHand.getHandSet();
            for (Hand parts : resultHand) {
                System.out.println(parts.getBody());
                System.out.println("______________________________________" + "\n");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
