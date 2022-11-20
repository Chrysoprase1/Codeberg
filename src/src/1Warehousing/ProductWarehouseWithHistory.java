
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory (String name, double capacity, 
            double initialBalance) {
        
        super (name, capacity, initialBalance);
        this.history = history;
        
        this.history.add (initialBalance);
    }
    
    public void addToWarehouse (double amount) {
        super.addToWarehouse (amount);
        history.add (super.getBalance());
    }
    
    public double takeFromWarehouse (double amount) {
        if (super.getBalance() < amount) {
            this.history.add (super.getBalance());
            return super.getBalance();
        }
        
        super.takeFromWarehouse (amount);
        history.add (super.getBalance());
        return amount;
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: "+this.history.maxValue());
        System.out.println("Smallest amount of product: "+this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
