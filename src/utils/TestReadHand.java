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
        int k=0;
        ReaderHand readerHand = new ReaderHand();
        Set<Hand> resultHand= new HashSet<>();
        try {
            readerHand.read("C:\\Users\\lost\\Desktop\\History\\Eminence_Gru\\test.txt");
            resultHand=readerHand.getHandSet();
            for (Hand parts:resultHand) {
                System.out.println(parts.getBody());
                k++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (k==4){
            System.out.println("test successful");
        }
    }

}
