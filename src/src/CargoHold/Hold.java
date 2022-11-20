import java.util.ArrayList;


public class Hold {
    private ArrayList<Suitcase> list;
    private int maxWeight;
    private int totalWeight;
    
    public Hold (int maxWeight) {
        this.list = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
            list.add (suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcases : list) {
            suitcases.printItems();
        }
    }
    
    public String howMany() {
        if (this.list.isEmpty()) {
            return "0 suitcases ";
        }
        
        if (this.list.size() == 1) {
            return "1 suitcase ";
        }
        
        return list.size() + " suitcases ";
    }
    
    public String toString() {
        return howMany() + "(" + this.totalWeight + " kg)";
    }
}
