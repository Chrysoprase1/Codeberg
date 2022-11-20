import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public void add (Item item) {
        if (this.items.isEmpty()) {
            this.items.add (item);
        }
    }
    
    public boolean isInBox (Item item) {
        if (items.isEmpty()) {
            return false;
        }
        
        return item.equals (items.get (0));
    }
}
