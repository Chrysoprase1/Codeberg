// program that stores Bookname Books in a hashmap (String, Book)
// prints the Books with printValues methods
// example code included

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println();
        printValueIfNameContains(hashmap, "prejud");
    }
    
    public static void printValues (HashMap<String, Book> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(hashmap.get(key).toString());
        }
    }
    
    public static void printValueIfNameContains (HashMap <String, Book> hashmap,
            String contains) {
        for (String key : hashmap.keySet()) {
            if (hashmap.get(key).getName().contains (contains))
                System.out.println(hashmap.get (key).toString());
        }
    }
}