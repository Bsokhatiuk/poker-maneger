package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Hand {
    private final int MAX_COUNT_PLAEYR = 9;
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
        players = new Player[MAX_COUNT_PLAEYR];
        setPlayer(body);
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

    public Player[] getPlayers() {
        return players;
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
                int row = i;
                int rownext = 0;
                while (!stringsLine[row + 1].contains("*** ")) {
                    resultpreFlop.append(stringsLine[row] + "\n");
                    row++;
                }
                resultpreFlop.append(stringsLine[row] + "\n");
                if (body.contains("*** FLOP ***")) {
                    rownext = row + 1;
                    while (!stringsLine[rownext + 1].contains("*** ")) {
                        resultFlop.append(stringsLine[rownext] + "\n");
                        rownext++;
                    }
                    resultFlop.append(stringsLine[rownext] + "\n");
                }
                if (body.contains("*** TURN ***")) {
                    row = rownext + 1;
                    while (!stringsLine[row + 1].contains("*** ")) {
                        resultTurn.append(stringsLine[row] + "\n");
                        row++;
                    }
                    resultTurn.append(stringsLine[row] + "\n");
                }
                if (body.contains("*** RIVER ***")) {
                    rownext = row + 1;
                    while (!stringsLine[rownext + 1].contains("*** ")) {
                        resultRiver.append(stringsLine[rownext] + "\n");
                        rownext++;
                    }
                    resultRiver.append(stringsLine[rownext] + "\n");
                }
                if (body.contains("*** SHOW DOWN ***")) {
                    row = rownext + 1;
                    while (!stringsLine[row + 1].contains("*** ")) {
                        resultShowdown.append(stringsLine[row] + "\n");
                        row++;
                    }
                    resultShowdown.append(stringsLine[row] + "\n");
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

    private void setPlayer(String body) {
        String[] stringsLine;
        String[] playerName;
        int i = 2;
        int numberPlayer = 0;
        stringsLine = body.split("\n");
        StringBuilder resultpreFlop = new StringBuilder();
        while (!stringsLine[i].contains("*** HOLE CARDS ***")) {
            if (stringsLine[i].contains("Seat ")) {

                playerName = stringsLine[i].split(" ");
                players[numberPlayer] = new Player(playerName[2]);
                numberPlayer++;
            }
            i++;
        }
    }

}
