// program that stores data in a StorageFacility class (String unit, Arraylist items)
// user can add as many items to the unit as he wants to
// adds and removes items at units + return (storageUnit())the units as a list
// remove() will automatically clear the hashmap by completely removing 
    // keys which are bound to an empty list
    // storageUnit() will only print non empty keys

public class Program {

    public static void main(String[] args) {
        
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));
        System.out.println(facility.storageUnits());

          

    }
}
