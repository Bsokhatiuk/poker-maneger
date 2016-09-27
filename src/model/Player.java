package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Player {
    private String Name;
    private Stats stats;

    public Player(String name) {
        Name = name;
        stats = new Stats();
    }

    public Player(String name, Stats stats) {
        Name = name;
        this.stats = stats;
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
