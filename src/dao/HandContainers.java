package dao;

import model.Hand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lost on 27.09.2016.
 */
public class HandContainers {
    private Map<Long, Hand> handmap;

    public HandContainers(Map<Long, Hand> handmap) {
        this.handmap = handmap;
    }

    public HandContainers() {
        handmap = new HashMap<>();
    }

    public Hand getHand(Long id) {
        return handmap.get(id);
    }

    public boolean addHand(Hand hand) {
        if (!handmap.containsKey(hand.getId())) {
            handmap.put(hand.getId(), hand);
            return true;
        }
        return false;
    }

    private Set<Long> getallHands() {
        if (!handmap.isEmpty()) {
            Set<Long> allHandid = new HashSet<>();
            return allHandid = handmap.keySet();
        }
        return null;

    }

    public Map<Long, Hand> getHandmap() {
        return handmap;
    }

    public void setHandmap(Map<Long, Hand> handmap) {
        this.handmap = handmap;
    }
}
