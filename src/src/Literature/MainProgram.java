// program that is looped to ask user for 2 inputs (title) + (age recommendation)
// will create a Book object of it and add to an arraylist
// program will stop at empty input ("");
// program will then print every book sorted by age recommendation (low to high)
// if books share the same age recommendation, they will then be sorted by name (A-Z)

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        
        // loop to create and add books to list until empty input is given
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.equals ("")) {
                break;
            }
            
            System.out.println("Input the age recommendation");
            int ageRecommendation = Integer.valueOf (scanner.nextLine());
            
            list.add (new Book (name, ageRecommendation));
        }
        // print book count in list
        System.out.println(list.stream().count() + " books in total.");
        
        // sort the books using the Comparator class (age, then name if age is same)
        Comparator<Book> comparator = Comparator
                .comparing (Book :: getAge)
                .thenComparing (Book :: getName);
        
        // sort the actual arraylist (list) now using Collections.sort
        Collections.sort (list, comparator);
        // print every element in list
        list.stream()
                .forEach (s -> System.out.println(s));
    }
}
