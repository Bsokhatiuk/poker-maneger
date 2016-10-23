package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lost on 27.09.2016.
 */
public class Stats {
    private Map<Constants.STATISTICS, Integer> totalStats;
    private Map<Constants.STATISTICS, Integer> preFlopStats;
    private Map<Constants.STATISTICS, Integer> flopStats;
    private Map<Constants.STATISTICS, Integer> turnStats;
    private Map<Constants.STATISTICS, Integer> riverStats;

    public Stats() {
        totalStats = new HashMap<>();
        preFlopStats = new HashMap<>();
        flopStats = new HashMap<>();
        turnStats = new HashMap<>();
        riverStats = new HashMap<>();
        init();
    }

    private void init() {
        Constants.STATISTICS[] stats = Constants.STATISTICS.values();
        for (Constants.STATISTICS stat : stats)
        {
            totalStats.put(stat, 0);
            preFlopStats.put(stat, 0);
            flopStats.put(stat, 0);
            turnStats.put(stat, 0);
            riverStats.put(stat, 0);

        }
    }


    public Map<Constants.STATISTICS, Integer> getTurnStats() {
        return turnStats;
    }

    public void setTurnStats(Map<Constants.STATISTICS, Integer> turnStats) {
        this.turnStats = turnStats;
    }


    public Map<Constants.STATISTICS, Integer> getTotalStats() {
        return totalStats;
    }

    public void setTotalStats(Map<Constants.STATISTICS, Integer> totalStats) {
        this.totalStats = totalStats;
    }

    public Map<Constants.STATISTICS, Integer> getPreFlopStats() {
        return preFlopStats;
    }

    public void setPreFlopStats(Map<Constants.STATISTICS, Integer> preFlopStats) {
        this.preFlopStats = preFlopStats;
    }

    public Map<Constants.STATISTICS, Integer> getFlopStats() {
        return flopStats;
    }

    public void setFlopStats(Map<Constants.STATISTICS, Integer> flopStats) {
        this.flopStats = flopStats;
    }


    public void setriverStats(Map<Constants.STATISTICS, Integer> riverStats) {
        this.riverStats = riverStats;
    }

    public Map<Constants.STATISTICS, Integer> getRiverStats() {
        return riverStats;
    }

    public void addStats(Constants.BORD bord, Constants.STATISTICS statistics) {
        if (bord.equals(Constants.BORD.PREFLOP)) {
            preFlopStats.put(statistics, preFlopStats.get(statistics) + 1);
        }
        if (bord.equals(Constants.BORD.FLOP)) {
            flopStats.put(statistics, flopStats.get(statistics) + 1);
        }
        if (bord.equals(Constants.BORD.TURN)) {
            turnStats.put(statistics, turnStats.get(statistics) + 1);
        }
        if (bord.equals(Constants.BORD.RIVER)) {
            riverStats.put(statistics, riverStats.get(statistics) + 1);
        }

    }

    public void nextHand() {
        totalStats.put(Constants.STATISTICS.COUNTHAND, totalStats.get(Constants.STATISTICS.COUNTHAND) + 1);
    }

    public String getStats(Map<Constants.STATISTICS, Integer> stats) {
        StringBuilder sb = new StringBuilder();
        Set<Constants.STATISTICS> set = stats.keySet();
        for (Constants.STATISTICS stat : set) {
            sb.append(stat.toString() + "=" + stats.get(stat).toString() + " ");

        }
        return sb.toString();
    }


}
