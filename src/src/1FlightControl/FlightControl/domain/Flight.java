
package FlightControl.domain;



public class Flight {
    private Airplane airplane;
    private Place departurePort;
    private Place targetPort;
    
    public Flight (Airplane airplane, Place departurePort, Place targetPort) {
        this.airplane = airplane;
        this.departurePort = departurePort;
        this.targetPort = targetPort;
    }
    
    public Airplane plane() {
        return this.airplane;
    }
    
    public Place getDeparturePort() {
        return this.departurePort;
    }
    
    public Place getTargetPort() {
        return this.targetPort;
    }
    
    public String toString() {
        return this.airplane.toString() + " (" + this.departurePort + "-" +
                this.targetPort + ")";
    }
}
