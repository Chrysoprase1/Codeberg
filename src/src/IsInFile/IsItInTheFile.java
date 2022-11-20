
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean nameFound = false;
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner (Paths.get (file))) {
            
            while (scanFile.hasNextLine()) {
                if (scanFile.nextLine().equals (searchedFor)) {
                    System.out.println("Found!");
                    nameFound = true;
                }
            }
            
            if (nameFound == false) {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) { 
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
