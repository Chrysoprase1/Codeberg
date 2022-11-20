
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int starcount = 0; starcount < array[i]; starcount++) {
                System.out.print ("*");
            }
            System.out.println();
        }
    }

}
