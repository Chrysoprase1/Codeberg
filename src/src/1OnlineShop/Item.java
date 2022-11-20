
public class Item {
    private String name;
    private int quantity;
    private int singlePrice;
    
    public Item (String name, int quantity, int singlePrice) {
        this.name = name;
        this.quantity = quantity;
        this.singlePrice = singlePrice;
    }
    
    public int price () {
        return this.quantity * this. singlePrice;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public String toString() {
        return this.name + ": " + this.quantity;
    }
}
