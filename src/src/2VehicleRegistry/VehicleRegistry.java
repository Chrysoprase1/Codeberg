import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> list;
    
    public VehicleRegistry() {
        this.list = new HashMap<>();
    }
    
    public boolean add (LicensePlate licensePlate, String owner) {
        if (!(this.list.containsKey (licensePlate))) {
            list.put (licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get (LicensePlate licensePlate) {
        if (this.list.containsKey (licensePlate)) {
            return list.get (licensePlate);
        }
        return null;
    }
    
    public boolean remove (LicensePlate licensePlate) {
        if (list.containsKey(licensePlate)) {
            list.remove (licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : this.list.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (String plate : this.list.values()) {
            if (!(owners.contains (plate))) {
                owners.add (plate);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
