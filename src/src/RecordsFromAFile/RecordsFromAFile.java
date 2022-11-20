// program that asks for csv-format file (name,age) and prints contents

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String name = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner (Paths.get (name))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                
                // splits into csv format
                String[] rowParts = row.split (",");
                String nameInFile = rowParts[0];
                int ageInFile = Integer.valueOf (rowParts [1]);
                
                // prints it
                if (ageInFile > 1 || ageInFile == 0) {
                    System.out.println(nameInFile + ", age: " + ageInFile + " years");
                }
                
                if (ageInFile == 1) {
                    System.out.println(nameInFile + ", age: " + ageInFile + " year");
                }
                
                if (ageInFile < 0) {
                    System.out.println("Invalid age input in File.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
