package org.example.Plane;

public class Main {
    public static void main(String[] args){
        Plane plane = new Plane("flightId1", 3);
        plane.setFlightDestination("Bora-Bora");
        plane.boardPassenger("Oleg Dovgal", 0);
        plane.boardPassenger("Anna Goreva", 1);
        plane.boardPassenger("Ksenia Shalyhina", 2);

        System.out.println("are you ready?");
    }
}
