import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> map;
    private Map<String, Integer> stockMap;
    
    public Warehouse() {
        this.map = new HashMap<String, Integer> ();
        this.stockMap = new HashMap<String,Integer>();
    }
    
    public void addProduct (String product, int price, int stock) {
        this.map.put (product, price);
        this.stockMap.put (product, stock);
    }
    
    public boolean take(String product) {
        if (this.stockMap.containsKey (product) && 
            this.stockMap.get (product) > 0) {
            
            this.stockMap.put (product, this.stockMap.get(product) -1);
            return true;
        }
        return false;
    }
    
    public int price (String product) {
        if (this.map.containsKey (product)) {
            return this.map.get (product);
        }
        return -99;
    }
    
    public int stock (String product) {
        if (this.stockMap.containsKey (product)) {
            return this.stockMap.get (product);
        }
        return 0;
    }
    
    public boolean contains (String name) {
        if (this.map.containsKey (name)) {
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String string : this.map.keySet()) {
            set.add (string);
        }
        return set;
    }
    
    
}