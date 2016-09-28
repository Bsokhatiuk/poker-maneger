package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Hand {

    private String body;
    private long id;
    private Player[] players;
    private Preflop preflop;
    private Flop flop;
    private Turn turn;
    private River river;
    private ShowDown showDown;


    public Hand(String body) {
        this.body = body;
    }

    public Hand(String body, long id) {
        this.body = body;
        this.id = id;

    }

    public String getBody() {
        return body;
    }

    public long getId() {
        return id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(long id) {
        this.id = id;
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

        if (id != hand.id) return false;
        return body != null ? body.equals(hand.body) : hand.body == null;

    }

    @Override
    public int hashCode() {
        int result = body != null ? body.hashCode() : 0;
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    private class Preflop {
        String preflopBody;

        public Preflop(String preflopBody) {
            this.preflopBody = preflopBody;
        }

        public String getPreflopBody() {
            return preflopBody;
        }

        public void setPreflopBody(String preflopBody) {
            this.preflopBody = preflopBody;
        }
    }

    private class Flop {
        String flopBody;

        public Flop(String flopBody) {
            this.flopBody = flopBody;
        }

        public String getPreflopBody() {
            return flopBody;
        }

        public void setflopBody(String flopBody) {
            this.flopBody = flopBody;
        }
    }

    private class Turn {
        String turnBody;

        public Turn(String turnBodyBody) {
            this.turnBody = turnBody;
        }

        public String getturnBody() {
            return turnBody;
        }

        public void setPreflopBody(String preflopBody) {
            this.turnBody = turnBody;
        }
    }

    private class River {
        String riverBody;

        public River(String riverBody) {
            this.riverBody = riverBody;
        }

        public String getRiver() {
            return riverBody;
        }

        public void setRiver(String preflopBody) {
            this.riverBody = riverBody;
        }
    }

    private class ShowDown {
        String ShowDownBody;

        public ShowDown(String ShowDownBody) {
            this.ShowDownBody = ShowDownBody;
        }

        public String getShowDownBody() {
            return ShowDownBody;
        }

        public void setShowDownBody(String ShowDownBody) {
            this.ShowDownBody = ShowDownBody;
        }
    }

}
