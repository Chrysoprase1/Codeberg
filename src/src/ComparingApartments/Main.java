// program that uses Apartment class methods to compare them to each other
// methods included to check which appartment is bigger or (how much) more expensive
    // Apartments have to be created in main
    // main includes some example method calls
public class Main {

    public static void main(String[] args) {
        
    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
    
    System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));      
    System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  

    System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  
    System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   
    
    System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  
    System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   
    }
}
