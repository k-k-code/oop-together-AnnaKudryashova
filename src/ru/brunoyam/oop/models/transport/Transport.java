package ru.brunoyam.oop.models.transport;

public abstract class Transport { // из абстрактного класса нельзя создать объект
    private int travelTime;
    private int seatsNumber;
    private int cost;

    public Transport(int travelTime, int seatsNumber, int cost) {
        this.travelTime = travelTime;
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "travelTime=" + travelTime +
                ", seatsNumber=" + seatsNumber +
                ", cost=" + cost +
                '}';
    }
}