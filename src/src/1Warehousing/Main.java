// program that includes a ProductWarehouseWithHistory class
// ProductWareHouseWithHistory extends a ProductWarehouse class and implements
// its stored changes (add, remove) into a ChangeHistory variable (list) at 
// the same time if done via ProductWarehouseWIthHistory class methods
// can print warehouse variables via super or ChangeHistory via variable

public class Main {

    public static void main(String[] args) {
        
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // balance = 988.7, space left 11.3
        
        ProductWarehouseWithHistory juicee = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juicee.takeFromWarehouse(11.3);
        System.out.println(juicee.getName()); 
        juicee.addToWarehouse(1.0);
        System.out.println(juicee);           

        System.out.println(juicee.history()); 
    }

}
