package model;


import utils.Contants;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lost on 27.09.2016.
 */
public class Stats {
    private  Map<String, Integer> statistic;

    public Stats() {
        statistic = new TreeMap<>();
        statistic.put("Count hands",0);
    }

    public Map<String, Integer> getStatistic() {
        return statistic;
    }

    public void setStatistic(Map<String, Integer> statistic) {
        this.statistic = statistic;
    }
}
