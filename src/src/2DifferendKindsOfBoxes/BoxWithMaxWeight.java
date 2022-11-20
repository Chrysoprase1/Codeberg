
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight (int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.capacity >= item.getWeight() || item.getWeight() == 0) {
            items.add (item);
            this.capacity = this.capacity - item.getWeight();
        }
    }
        
    public boolean isInBox (Item item) {
        for (Item singleItem : items) {
            if (singleItem.equals (item)) {
                return true;
            }
        }
        return false;
    }
}


