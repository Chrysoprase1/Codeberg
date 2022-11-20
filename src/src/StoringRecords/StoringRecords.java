// program that reads csv-format file input (name,age)
// the program will then create new <Person> objects for every line from the file
// then adds created Persons into an arraylist

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();


        try (Scanner scanFile = new Scanner (Paths.get (file))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                
                String[] rowParts = row.split (",");
                String name = rowParts[0];
                int age = Integer.valueOf (rowParts[1]);
                
                persons.add (new Person (name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return persons;

    }
}
