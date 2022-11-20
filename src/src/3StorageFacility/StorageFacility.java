import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> list;
    
    public StorageFacility() {
        this.list = new HashMap <>();
    }
    
    public void add (String unit, String item) {
        this.list.putIfAbsent (unit, new ArrayList<>());
        
        this.list.get (unit).add (item);
    }
    
    public ArrayList<String> contents (String storageUnit) {
        if (!(this.list.containsKey(storageUnit))) {
            this.list.put (storageUnit, new ArrayList<>());
        }
        return this.list.get (storageUnit);
    }
    
    public void remove (String unit, String item) {
        this.list.get (unit).remove (item);
        
        if (this.list.get (unit).isEmpty()) {
            this.list.remove (unit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        // add units into list to return them in the end
        for (String unit : this.list.keySet()) {
            units.add (unit);
        }
        // remove units bound to empty lists
        for (String unit : this.list.keySet()) {
            if (this.list.get (unit).isEmpty()) {
                units.remove (unit);
            }
        }
        return units;
    } 
}
