import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase (int maxWeight) {
        this.list = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addItem (Item item) {
        if (this.totalWeight + item.getWeight() <= maxWeight) {
            this.totalWeight = this.totalWeight + item.getWeight();
            list.add (item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item : list) {
            weight = weight + item.getWeight();
        }
        return weight;
    }
    
    public void printItems() {
        for (Item items : list) {
            System.out.println(items.toString());
        }
    }
    
    public String howMany() {
        if (list.isEmpty()) {
            return "no items ";
        }
        if (list.size() == 1) {
            return "1 item ";
        }
        return list.size() + " items ";
    }
    
    public Item heaviestItem () {
        
        Item heaviestItem = null;
        
        if (list.size() > 0) {
            heaviestItem = list.get (0);

            for (Item items : list) {
                if (heaviestItem.getWeight() <= items.getWeight()) {
                    heaviestItem = items;
                }
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        return howMany() + "(" + this.totalWeight + " kg)";
    }
}
