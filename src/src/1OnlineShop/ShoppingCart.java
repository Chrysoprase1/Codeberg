import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart () {
        this.cart = new HashMap<>();
    }
    
    public void add (String product, int price) {
        // starting quantity = 1
        // increase and return it if already in hashmap before putting it in 
        int quantity = 1;
        if (this.cart.containsKey (product)) {
            this.cart.get (product).increaseQuantity();
            quantity = this.cart.get(product).getQuantity();
        } else {
            Item add = new Item (product, 1, price);
        }
        
        cart.put (product, new Item (product, quantity, price));
    }
    
    public Item getItem (String name) {
        return this.cart.get (name);
    }
    
    public int price() {
        int price = 0;
        
        for (Item item : this.cart.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (String string : this.cart.keySet()) {
            System.out.println(string + ": " + this.cart.get(string).getQuantity());
        }
    }
}
