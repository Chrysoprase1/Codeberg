// program that includes Money class (final euro, final cent)
// Money class implements boolean to check whether a Money object is smaller
// than a compared Money object or not
// also has methods to create new Money objects with 
// substracted or added Money object values
    // example test code in main
    // methods can be found in Money.java

public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);
        Money c = a.minus(b);
        Money d = a.plus(c);  
        Money e = c.minus(a);  
        
        System.out.println();
        
        System.out.println(a);  
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d);  
        System.out.println(e);  
    
        System.out.println();

        System.out.println(a.lessThan(b)); 
        System.out.println(b.lessThan(a)); 
    }
}
