// program that adds a Book class (int id, String name)
// includes a linear search and a binary search method in main
    // searches for a liststored Book object and returns its index in the array
    // returns -1 if the arraylist does not contain a Book object with 
    // corresponding ID variable
    // maintest included which asks for an input number 
    // array will be every integer from 0 - number
    // user can search for a value then and get a return from linear + binary search

import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if ( books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        // binary search starts at full list 0 - list.size() - 1
        int beginValue = 0;
        int endValue = books.size() - 1;
        
        // loop will inevitable end if begin and end are the same
        // because mid halves either begin or end by hald and round down
            // --> begin (0) == end (0)
        while (beginValue <= endValue) {
            int middle = (beginValue + endValue) / 2;
            
            // return bookId if it equals searchedId
            if (books.get (middle).getId() == searchedId) {
                return middle;
            }
            
            // middle of the array is smaller than searchedId
            // searchedId must be greater than every other value before middle
            // begin next loop at end of middle
            if (books.get(middle).getId() < searchedId) {
                beginValue = middle + 1;
            }
            
            // middle of array is greater than searchedId
            // searchedId has to be smaller than middle
            // end the next loop at middle - 1
            if (books.get(middle).getId() > searchedId) {
                endValue = middle - 1;
            }
        }
        return -1;
    }
}

