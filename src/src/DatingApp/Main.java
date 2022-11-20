// program that has a SimpleDate class
    // SimpleDate stores date variables (day,month,year) and can adcance it
    // dates assume each month of the year has 30 days for now
    // clone method for new date object creation for variables after (int days)

public class Main {

    public static void main(String[] args) {
        
        SimpleDate date = new SimpleDate (25, 11, 2004);
        SimpleDate date2 = new SimpleDate (01,01,2000);
        
        for (int i = 0; i < 5; i++) {
            date2.advance();
            System.out.println(date2);
        }
        System.out.println("");
        date2.advance (10);
        System.out.println(date);
        System.out.println("");
        
        System.out.println(date2);
        System.out.println(date2.afterNumberOfDays (10));
    }
}
