package com.panda.patten.protrotype.deep;

import java.io.Serializable;

public class Shooter implements Serializable {
    public int power;
    public int firing_rate;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFiring_rate() {
        return firing_rate;
    }

    public void setFiring_rate(int firing_rate) {
        this.firing_rate = firing_rate;
    }
}
