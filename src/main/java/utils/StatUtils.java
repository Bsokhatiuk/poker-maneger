package java.utils;

import java.dao.PlayerContainers;
import java.model.Constants;
import java.model.Hand;
import java.model.Player;
import java.model.Stats;

/**
 * Created by lost on 08.10.2016.
 */
public class StatUtils {
    private PlayerContainers playerContainers;

    public StatUtils() {
    }

    public PlayerContainers getPlayerContainers() {
        return playerContainers;
    }

    public void setPlayerContainers(PlayerContainers playerContainers) {
        this.playerContainers = playerContainers;
    }

    public StatUtils(PlayerContainers playerContainers) {
        this.playerContainers = playerContainers;
    }

    public void parseHand(Hand hand) {
        String infohand = hand.getInfoHand();
        String preflop = hand.getPreflop();
        String flop = hand.getFlop();
        String turn = hand.getTurn();
        String river = hand.getRiver();

        String[] pars;
        String[] PlayerName;
        pars = infohand.split("\n");
        for (int i = 3; i < pars.length - 2; i++) {
            PlayerName = pars[i].split(" ");
            countHand(PlayerName[2] + ":");
        }

        if (preflop != null) {
            pars = preflop.split("\n");
            for (int i = 2; i < pars.length; i++) {
                if (parceAction(pars[i]) != null) {
                    PlayerName = pars[i].split(" ");
                    addStatPlayer(PlayerName[0], Constants.BORD.PREFLOP, parceAction(pars[i]));
                }
            }

        }
        if (flop != null || flop.length() > 2) {
            pars = flop.split("\n");
            for (int i = 1; i < pars.length; i++) {
                if (parceAction(pars[i]) != null) {
                    PlayerName = pars[i].split(" ");
                    addStatPlayer(PlayerName[0], Constants.BORD.FLOP, parceAction(pars[i]));
                }
            }

        }
        if (turn != null || flop.length() > 2) {
            pars = turn.split("\n");
            for (int i = 1; i < pars.length; i++) {
                if (parceAction(pars[i]) != null) {
                    PlayerName = pars[i].split(" ");
                    addStatPlayer(PlayerName[0], Constants.BORD.TURN, parceAction(pars[i]));
                }
            }

        }

        if (river != null || flop.length() > 2) {
            pars = river.split("\n");
            for (int i = 1; i < pars.length; i++) {
                if (parceAction(pars[i]) != null) {
                    PlayerName = pars[i].split(" ");
                    addStatPlayer(PlayerName[0], Constants.BORD.RIVER, parceAction(pars[i]));
                }
            }

        }
    }

    private void addStatPlayer(String namePlayer, Constants.BORD bord, Constants.STATISTICS statistics) {
        Player player;
        Stats stats;
        if (playerContainers.containsPlayer(new Player(namePlayer))) {
            player = playerContainers.getPlayer(namePlayer);
        } else player = new Player(namePlayer);
        stats = player.getStats();
        stats.addStats(bord, statistics);
        player.setStats(stats);
        playerContainers.setPlayer(player);
    }

    private void countHand(String namePlayer) {
        Player player;
        Stats stats;
        if (playerContainers.containsPlayer(new Player(namePlayer))) {
            player = playerContainers.getPlayer(namePlayer);
        } else player = new Player(namePlayer);
        stats = player.getStats();
        stats.nextHand();
        player.setStats(stats);
        playerContainers.addPlayer(player);
    }

    private Constants.STATISTICS parceAction(String str) {
        if (str.contains("fold")) return Constants.STATISTICS.CFOLD;
        if (str.contains("checks")) return Constants.STATISTICS.CCHECK;
        if (str.contains("bets")) return Constants.STATISTICS.CBET;
        if (str.contains("calls")) return Constants.STATISTICS.CCALL;
        if (str.contains("raises")) return Constants.STATISTICS.CREISE;
        else return null;
    }
}
