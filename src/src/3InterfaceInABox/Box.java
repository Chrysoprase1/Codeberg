import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> box;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add (Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            box.add (item);
        }
    }
    
    public double weight() {
        double weight = 0.0;
        for (Packable pack : box) {
            weight += pack.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + this.weight()+ " kg";
    }
}
