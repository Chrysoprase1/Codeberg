package FlightControl.logic;


import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private HashMap<String, Place> places = new HashMap<>();
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane (String id, int capacity) {
        this.airplanes.put (id, new Airplane (id, capacity));
    }
    
    public void addFlight(Airplane plane, String departureid, String targetid) {
        places.putIfAbsent (departureid, new Place (departureid));
        places.putIfAbsent (targetid, new Place (targetid));
        
        Flight newFlight = new Flight (plane, this.places.get (departureid),
                this.places.get (targetid));
        this.flights.put (newFlight.toString(), newFlight);
    }
    
    public Airplane getAirplane(String id) {
        return this.airplanes.get (id);
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
}
