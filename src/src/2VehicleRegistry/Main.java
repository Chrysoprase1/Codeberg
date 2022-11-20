// program that stores LicensePlate objects into a registry object
// the registry is hashmap which links and may  print, add or remove owners/plates
// printOwners() from VehicleRegistry class will print owners only once, even  
// if they are stored multiple times in it by owning multiple plates
// the LicensePlate class has an overriden equals/hashcode to check if different
// objects with same values are equal as well or not


import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        
        LicensePlate r1 = new LicensePlate("FI", "ABC-123");
        LicensePlate r2 = new LicensePlate("FI", "ABC-122");
        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r1));
    }
}
