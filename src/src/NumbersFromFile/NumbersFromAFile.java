// program that asks user for file input, lower and upper bounds
// the program will then print the numbers between the bounds
// if they are included in the file
// also prints how many numbers were within the bounds
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        System.out.println ("File? ");
        String file = scanner.nextLine();
        System.out.println ("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println ("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner readFile = new Scanner (Paths.get (file))) {
            while (readFile.hasNextLine()) {
                int row = Integer.valueOf (readFile.nextLine());
                if (row >= lowerBound && row <= upperBound) {
                    System.out.println (row);
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Numbers: " + count);
    }
}
