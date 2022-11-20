// program that compares two SimpleDate objects
    // can check whether one is earlier than the other
    // can print the year difference between the two dates
    // can compare whether the dates are equal or not
        // comparison includes a hashdate override to compare  equal values of
        // different objects
public class Main {

    public static void main(String[] args) {
        
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));

    }
}
