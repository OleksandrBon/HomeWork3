package org.example.Plane;

public class FlightBoarding {
    public static void main(String[]  args){
        Plane[] airportPlanes = new Plane[3];
        airportPlanes[0] = new Plane("Flght1", 3);
        airportPlanes[1] = new Plane("Flght2", 3);
        airportPlanes[2] = new Plane("Flght3", 2);

        FlightControl airport = new FlightControl(airportPlanes);
        airport.setPlaneDestination("Flght1", "Atlanta");
        airport.setPlaneDestination("Flght2", "NY");
        airport.setPlaneDestination("Flght3", "Zhytomyr");

        createPassengers(airport);


        for (int i = 0; i < airport.passengerNames.length; i++) {
            airport.boardPassenger(i);
        }

        }

    public static void createPassengers(FlightControl airport) {
        airport.registerPassenger(0, "Alice", 0, "Flght1");
        airport.registerPassenger(1, "Bob", 1, "Flght1");

        airport.registerPassenger(2, "Joe", 0, "Flght2");
        airport.registerPassenger(3, "Jane", 1, "Flght2");
        airport.registerPassenger(4, "Alice", 2, "Flght2");

        airport.registerPassenger(5, "Sarah", 0, "Flght3");
        airport.registerPassenger(6, "Arnie", 1, "Flght3");
        airport.registerPassenger(7, "Kyle", 2, "Flght3");
    }
}
