package org.oop.sim;

public abstract class SIM {
    protected final String number;

    public SIM(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
