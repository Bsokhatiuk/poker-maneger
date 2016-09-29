package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Hand {

    private String body;
    private long id;
    private Player[] players;
    private String preflop;
    private String flop;
    private String turn;
    private String river;
    private String showdown;


    public Hand(String body) {
        this.body = body;
        setPartHand(body);
    }

    public String getBody() {
        return body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPreflop() {
        return preflop;
    }

    public String getFlop() {
        return flop;
    }

    public String getTurn() {
        return turn;
    }

    public String getRiver() {
        return river;
    }

    public String getShowdown() {
        return showdown;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hand hand = (Hand) o;

        return body != null ? body.equals(hand.body) : hand.body == null;

    }

    @Override
    public int hashCode() {
        return body.hashCode();
    }

    public void setPartHand(String body) {
        String[] stringsLine;
        stringsLine = body.split("\n");
        StringBuilder resultpreFlop = new StringBuilder();
        StringBuilder resultFlop = new StringBuilder();
        StringBuilder resultTurn = new StringBuilder();
        StringBuilder resultRiver = new StringBuilder();
        StringBuilder resultShowdown = new StringBuilder();
        for (int i = 0; i < stringsLine.length; i++) {
            if (stringsLine[i].contains("*** HOLE CARDS ***")) {
                int j = i;
                int k = 0;
                while (!stringsLine[j + 1].contains("*** ")) {
                    resultpreFlop.append(stringsLine[j]+"\n");

                    j++;
                }
                if (body.contains("*** FLOP ***")) {
                    k = j + 1;
                    while (!stringsLine[k].contains("*** ")) {
                        resultFlop.append(stringsLine[k]+"\n");
                        k++;
                    }
                }
                if (body.contains("*** TURN ***")) {
                    j = k + 1;
                    while (!stringsLine[j].contains("*** ")) {
                        resultTurn.append(stringsLine[j]+"\n");
                        j++;
                    }
                }
                if (body.contains("*** RIVER ***")) {
                    k = j + 1;
                    while (!stringsLine[k].contains("*** ")) {
                        resultRiver.append(stringsLine[k]+"\n");
                        k++;
                    }
                }
                if (body.contains("*** SHOW DOWN ***")) {
                    j = k + 1;
                    while (!stringsLine[j].contains("*** ")) {
                        resultShowdown.append(stringsLine[j]+"\n");
                        j++;
                    }
                }
                break;
            }
        }
        this.preflop = resultpreFlop.toString();
        this.flop = resultFlop.toString();
        this.turn = resultTurn.toString();
        this.river = resultRiver.toString();
        this.showdown = resultShowdown.toString();
    }

}
