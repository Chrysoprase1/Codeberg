
package FlightControl.domain;


public class Airplane {
    private String ID;
    private int capacity;
    
    public Airplane (String id, int capacity) {
        this.ID = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.ID;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
