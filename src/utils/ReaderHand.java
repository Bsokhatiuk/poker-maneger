package utils;

import model.Hand;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 28.09.2016.
 */
public class ReaderHand {
    private Set<Hand> handSet;
    private String[] hand;

    public ReaderHand() {
        handSet = new HashSet<>();
    }

    public Set<Hand> getHandSet() {
        return handSet;
    }

    public void setHandSet(Set<Hand> handSet) {
        this.handSet = handSet;
    }

    public boolean read(String path) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
        String line;
        StringBuilder putHands = new StringBuilder();
        try {
            while ((line = bufferedReader.readLine()) != null) {
                putHands.append(line + "\n");
            }
            hand = putHands.toString().split("\n" + "\n" + "\n");
            for (int i = 0; i < hand.length; i++)
                handSet.add(new Hand(hand[i]));

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException t) {
            }
        }
        return false;
    }
}
