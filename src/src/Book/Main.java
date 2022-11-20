// program that asks user for inputs (name, year)
// creates Book class objects (name, year) and adds them into arraylist
// if equal object is already included, it wont be added and print a message
// comparemethod in Book.java

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        boolean included = false;

        while (true) {
            included = false;
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals (book)) {
                    included = true;
                } 
            }
            if (included == false) {
                books.add (book);
            }
            
            if (included == true) {
                System.out.println("The book is already on the list. "
                    + "Let's not add the same book again.");
            }
        }
        
        System.out.println("Thank you! Books added: " + books.size());
    }
}
