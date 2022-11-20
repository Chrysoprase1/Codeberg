

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne (5);

    }

    public static void printFromNumberToOne (int number) {
        int i = number;
        int e = 1;
        
        System.out.println (i);
        
        while (true) {
            
           
            i = i - 1;
            System.out.println (i);
            
            if ( i == e){
                break;
            }
        }
    }
}
