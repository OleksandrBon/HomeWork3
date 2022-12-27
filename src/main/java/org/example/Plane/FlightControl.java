package org.example.Plane;

public class FlightControl {

    public Plane[] planes;
    public String[] passengerNames = new String[8];
    public int[] passengerSeats = new int [8];
    public String[] passengerFlights = new String[8];
    public String[] destinations;

    public FlightControl(Plane[] airportPlanes) {
        planes = airportPlanes;
        destinations = new String[] {"Atlanta", "Maldives"};
    }

    public void setPlaneDestination(String flightId, String destination){
        Plane plane = getPlaneByFlightId(flightId);
        plane.setFlightDestination(destination);

    }

    public void boardPassenger(int passengerId) {
        String passengerName = passengerNames[passengerId];
        int passengerSeat = passengerSeats[passengerId];
        String flightId = passengerFlights[passengerId];

        Plane plane = getPlaneByFlightId(flightId);
        plane.boardPassenger(passengerName, passengerSeat);
    }

    public Plane getPlaneByFlightId(String flightId) {
        for (int i = 0; i < planes.length ; i++) {
            if (planes[i].flightId.equals(flightId)){
                return planes[i];
            }

        }
        return null;
    }

    public void registerPassenger(int passengerId, String passengerName, int passengerSeat, String flightId){
        passengerNames[passengerId] = passengerName;
        passengerSeats[passengerId] = passengerSeat;
        passengerFlights[passengerId] = flightId;
    }
}
