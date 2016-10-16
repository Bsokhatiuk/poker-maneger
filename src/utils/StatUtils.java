package utils;

import dao.PlayerContainers;
import model.Hand;
import model.Player;
import model.Stats;

/**
 * Created by lost on 08.10.2016.
 */
public class StatUtils {
    private PlayerContainers playerContainers;

    public StatUtils() {
    }

    public StatUtils(PlayerContainers playerContainers) {
        this.playerContainers = playerContainers;
    }

    public void add(Hand hand) {

        String players[];
        String preFlop[];
        String flop[];
        String turn[];
        String river[];
        Player player;
        Stats stats;
        preFlop = hand.getPreflop().split("\n");
        for (int i = 2; i < preFlop.length; i++) {
            if (action(preFlop[i]) != -1) {
                players = (preFlop[i].split(":"));

                if (!playerContainers.containsPlayer(new Player(players[0]))) {
                    playerContainers.addPlayer(new Player(players[0]));
                }
                player = playerContainers.getPlayer(players[0]);
                stats = player.getStats();
                stats.setCountHand();
                stats.addAction(action(preFlop[i]), Constants.BORD.PREFLOP);
                player.setStats(stats);
                playerContainers.setPlayer(player);
            }

        }

        String floper = hand.getFlop();
        if (floper.length() > 1) {
            flop = floper.split("\n");
            for (int i = 1; i < flop.length; i++) {
                if (action(flop[i]) != -1) {
                    players = (flop[i].split(":"));
                    player = playerContainers.getPlayer(players[0]);
                    if (player == null) {
                        player = new Player(players[0]);
                    }
                    stats = player.getStats();
                    stats.addAction(action(flop[i]),  Constants.BORD.FLOP);
                    player.setStats(stats);
                    playerContainers.setPlayer(player);
                }
            }
        }
        String turner = hand.getTurn();

        if (turner.length() > 1) {
            turn = turner.split("\n");
            for (int i = 1; i < turn.length; i++) {
                if (action(turn[i]) != -1) {
                    players = (turn[i].split(":"));
                    player = playerContainers.getPlayer(players[0]);
                    if (player == null) {
                        player = new Player(players[0]);
                    }
                    stats = player.getStats();
                    stats.addAction(action(turn[i]),  Constants.BORD.TURN);
                    player.setStats(stats);
                    playerContainers.setPlayer(player);
                }
            }
        }

        String riverer = hand.getRiver();

        if (riverer.length() > 1) {
            river = riverer.split("\n");
            for (int i = 1; i < river.length; i++) {
                if (action(river[i]) != -1) {
                    players = (river[i].split(":"));
                    player = playerContainers.getPlayer(players[0]);
                    if (player == null) {
                        player = new Player(players[0]);
                    }
                    stats = player.getStats();
                    stats.addAction(action(river[i]),  Constants.BORD.RIVER);
                    player.setStats(stats);
                    playerContainers.setPlayer(player);
                }
            }

        }
    }

    private int action(String str) {
        if (str.contains(Constants.CALL.calls.toString())) return 0;
        if (str.contains(Constants.BET.bets.toString())) return 1;
        if (str.contains(Constants.CHECK.checks.toString())) return 5;
        if (str.contains(Constants.REISE.raises.toString())) return 1;
        if (str.contains(Constants.FOLD.folds.toString())) return 2;
        return -1;
    }

    private void cheakAction() {

    }

}
