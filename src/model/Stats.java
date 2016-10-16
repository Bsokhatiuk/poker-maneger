package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lost on 27.09.2016.
 */
public class Stats {
    private Integer countHand;
    private Integer countCall;
    private Integer countReise;
    private Integer countFold;
    private Integer count3bet;
    private Integer count4bet;
    private Integer countCheackCall;
    private Integer countCheack;
    private Map<String, List<Integer>> statistic;
    private List<Integer> preFlopStatistic;
    private List<Integer> flopStatistic;
    private List<Integer> turnStatistic;
    private List<Integer> riverStatistic;


    public Stats() {
        preFlopStatistic = new ArrayList<>();
        flopStatistic = new ArrayList<>();
        turnStatistic = new ArrayList<>();
        riverStatistic = new ArrayList<>();
        statistic = new HashMap<String, List<Integer>>();
        initCountStat();
        init(preFlopStatistic);
        init(flopStatistic);
        init(turnStatistic);
        init(riverStatistic);
        statistic.put("Preflop", preFlopStatistic);
        statistic.put("Flop", flopStatistic);
        statistic.put("Turn", turnStatistic);
        statistic.put("River", riverStatistic);

    }

    private void init(List list) {
        //call idex 0
        list.add(countCall);
        //reise idex 1
        list.add(countReise);
        //fold index 2
        list.add(countFold);
        //3bet index 3
        list.add(count3bet);
        //cheackcall index 4
        list.add(countCheackCall);
        //chaeck index 5
        list.add(countCheack);
        //4bet index 6
        list.add(count4bet);
    }

    private void initCountStat() {
        countHand = 0;
        countCall = 0;
        countReise = 0;
        countFold = 0;
        count3bet = 0;
        countCheackCall = 0;
        countCheack = 0;
        count4bet = 0;
    }

    public Map<String, List<Integer>> getStatistic() {
        return statistic;
    }


    public void setCountHand() {
        countHand++;
    }

    public void addAction(Integer action, Constants.BORD bord) {
        if (bord.equals(Constants.BORD.PREFLOP)) {
            countCall = preFlopStatistic.get(action);
            countCall++;
            preFlopStatistic.add(action, countCall);
        } else if (bord.equals(Constants.BORD.FLOP)) {
            countCall = preFlopStatistic.get(action);
            countCall++;
            flopStatistic.add(action, countCall);
        } else if (bord.equals(Constants.BORD.TURN)) {
            countCall = preFlopStatistic.get(action);
            countCall++;
            turnStatistic.add(action, countCall);
        } else if (bord.equals(Constants.BORD.RIVER)) {
            countCall = preFlopStatistic.get(action);
            countCall++;
            riverStatistic.add(action, countCall);
        }
    }

    public void setCountReise(Integer countReise) {
        this.countReise = countReise;
    }

    public void setCountFold(Integer countFold) {
        this.countFold = countFold;
    }

    public void setCount3bet(Integer count3bet) {
        this.count3bet = count3bet;
    }

    public void setCount4bet(Integer count4bet) {
        this.count4bet = count4bet;
    }

    public void setCountCheackCall(Integer countCheackCall) {
        this.countCheackCall = countCheackCall;
    }

    public void setCountCheack(Integer countCheack) {
        this.countCheack = countCheack;
    }

    public List<Integer> getPreFlopStatistic() {
        return preFlopStatistic;
    }

    public void setPreFlopStatistic(List<Integer> preFlopStatistic) {
        this.preFlopStatistic = preFlopStatistic;
    }

    public List<Integer> getFlopStatistic() {
        return flopStatistic;
    }

    public void setFlopStatistic(List<Integer> flopStatistic) {
        this.flopStatistic = flopStatistic;
    }

    public List<Integer> getTurnStatistic() {
        return turnStatistic;
    }

    public void setTurnStatistic(List<Integer> turnStatistic) {
        this.turnStatistic = turnStatistic;
    }

    public List<Integer> getRiverStatistic() {
        return riverStatistic;
    }

    public void setRiverStatistic(List<Integer> riverStatistic) {
        this.riverStatistic = riverStatistic;
    }

    public void setStatistic(Map<String, List<Integer>> statistic) {
        this.statistic = statistic;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "countHand=" + countHand + "\n" + " Preflop call=" + preFlopStatistic.get(0) + ", Reise= " + preFlopStatistic.get(1) +
                ", Fold= " + preFlopStatistic.get(2) + ", Chack= " + preFlopStatistic.get(5) + "\n" +
                " Flop call=" + flopStatistic.get(0) + ", Reise= " + flopStatistic.get(1) +
                ", Fold= " + flopStatistic.get(2) + ", Chack= " + flopStatistic.get(5) + "\n" +
                " Turn call=" + turnStatistic.get(0) + ", Reise= " + turnStatistic.get(1) +
                ", Fold= " + turnStatistic.get(2) + ", Chack= " + turnStatistic.get(5) + "\n" +
                " River call=" + riverStatistic.get(0) + ", Reise= " + riverStatistic.get(1) +
                ", Fold= " + riverStatistic.get(2) + ", Chack= " + riverStatistic.get(5) + ')';
    }
}
