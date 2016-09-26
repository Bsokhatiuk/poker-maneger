package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Player {
    private String Name;
    private double stack;
    private int seat;
    private String combo;
    private Stats stats;

    public Player(String name) {
        Name = name;
    }

    public double getStack() {
        return stack;
    }

    public void setStack(double stack) {
        this.stack = stack;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (Name != null ? !Name.equals(player.Name) : player.Name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Name != null ? Name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
