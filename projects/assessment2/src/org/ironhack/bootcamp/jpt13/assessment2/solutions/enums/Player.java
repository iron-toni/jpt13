package org.ironhack.bootcamp.jpt13.assessment2.solutions.enums;

import org.ironhack.bootcamp.jpt13.assessment2.common.SubscriptionType;

public class Player {
    private String name;
    private String email;
    private int points;
    private SubscriptionType subscriptionType;

    public Player(String name, String email, int points, SubscriptionType subscriptionType) {
        setName(name);
        setEmail(email);
        setPoints(points);
        setSubscriptionType(subscriptionType);
    }

    // Write your code here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    public void applyReward(int reward) {
        switch (getSubscriptionType()) {
            case GOLD:
                this.points += 3*reward;
                break;
            case SILVER:
                this.points += 2*reward;
                break;
            case FREE:
                this.points += reward;
                break;
        }
    }
}
