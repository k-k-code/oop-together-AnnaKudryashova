package ru.brunoyam.oop.models.transport;

public class Bus extends Transport {
    private boolean hasToilet;
    private int stopsNumber;

    public Bus(boolean hasToilet, int stopsNumber,
               int travelTime, int seatsNumber, int cost) {
        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
    }
    public boolean isHasToilet() {
        return hasToilet;
    }
    public int getStopsNumber() {
        return stopsNumber;
    }
    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }
    @Override
    public String toString() {
        String transportDescription = super.toString() + "particular: ";
        return transportDescription + "Bus{" +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber +
                '}';
    }
}