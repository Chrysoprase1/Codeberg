// program that compares of two SimpleDate objects are equal to another 
    // also can show difference in years variable between two dates
    // also includes a boolean whether one date is earlier than the other ot nor

public class Main {

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
