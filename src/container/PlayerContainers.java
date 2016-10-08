package container;

import model.Player;

import java.util.*;

/**
 * Created by lost on 27.09.2016.
 */
public class PlayerContainers {
    private Map<String, Player> playerMap;

    public PlayerContainers(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
    }

    public PlayerContainers() {
        playerMap = new HashMap<>();
    }

    public Player getPlayer(String playerName) {
        return playerMap.get(playerName);
    }

    public boolean addPlayer(Player player) {
        playerMap.put(player.getName(), player);
        return playerMap.containsKey(player.getName());
    }

    public Set<String> getAllPlayer() {
        if (!playerMap.isEmpty()) {
            Set<String> allPlayer = new HashSet<>();
            allPlayer = playerMap.keySet();
            return allPlayer;
        }
        return null;
    }
    public void setPlayer (Player player){
        playerMap.replace(player.getName(),player);

    }
    public boolean containsPlayer(Player player){
        return playerMap.containsKey(player.getName());
    }

    public Map<String, Player> getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
    }
}
