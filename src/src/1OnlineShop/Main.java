// program that simulates an onlineshop
// Warehouse objects store Item objects as well as their remaining quantity
// ShoppingCart objects store Item objects and return their price
// Store objects act as an interface, asking the user to input purchases
    // ShoppingCart will then grab Items from warehouse if possible and will 
    // calculate the total costs for all items, then return the costs and
    // purchased items list
    // items can be purchased multiple times if enought quantity, program will
    // calculate the quantity increase
    // example code included
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        
        Warehouse warehouse2 = new Warehouse();
        warehouse2.addProduct("milk", 3, 10);
        warehouse2.addProduct("coffee", 5, 6);
        warehouse2.addProduct("buttermilk", 2, 20);
        warehouse2.addProduct("yogurt", 2, 20);

        String exampleCustomer = "exampler";
        Store store = new Store(warehouse2, scanner);
        
        store.shop (exampleCustomer);
        
        
        /*
        warehouse.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        System.out.println();
        System.out.println("products:");

        for (String product: warehouse2.products()) {
            System.out.println(product);
        }
        System.out.println();
        
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());
        System.out.println();
        
        ShoppingCart cart2 = new ShoppingCart();
        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("buttermilk", 2);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");
        */
    }
}
