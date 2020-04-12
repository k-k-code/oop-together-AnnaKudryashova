package ru.brunoyam.oop.models.transport;

public class Plane extends Transport {
   public boolean luggage;

   public Plane(int travelTime, int seatsNumber, int cost, boolean luggage) {
      super(travelTime, seatsNumber, cost);
      this.luggage = luggage;
   }
}
