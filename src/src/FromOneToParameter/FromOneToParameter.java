

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber (5);
        

    }

    public static void printUntilNumber (int number) {
        int i = 0;
        for (i = 1; i <= number; i++) {
            System.out.println (i);
        }
    }
}
