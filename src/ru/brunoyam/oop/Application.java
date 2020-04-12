package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.Bus;
import ru.brunoyam.oop.models.transport.Plane;
import ru.brunoyam.oop.models.transport.Transport;

public class Application {
    public static void main(String[] args) {
        Passenger emptyPassenger = new Passenger(); //конструктор
        Passenger passenger = new Passenger("1234567890");
        Passenger fullPassenger = new Passenger("Ivan", "Ivanov", "Ivanovich", "0123456789");
        Passenger passengerCopy = fullPassenger;
        int a = 10;
        int b = a;
        changePrimitive(b);
        changePassenger(passengerCopy);
        System.out.println(fullPassenger.getFullName());
        System.out.println(fullPassenger);
    }

    private static void changePrimitive(int value) {
        value = 100;
    }

    private static void changePassenger(Passenger value) {
        value.name = "Fedor";
    }

    private static void createTransport() {
        Plane plane = new Plane(180, 160, 25000, true);
        Bus bus = new Bus(true, 1, 600, 54, 2500);
        System.out.println(bus.toString());
        System.out.println(plane.toString());
        Transport[] transports = new Transport[2];

        transports[0] = plane;
        transports[1] = bus;
        for (Transport value : transports) {
            System.out.println(value.toString());
            System.out.println("ticket cost: " + value.getCost());
        }
       }
}