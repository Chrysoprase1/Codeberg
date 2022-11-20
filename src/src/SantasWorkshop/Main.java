// program that includes a Gift class (String name, int weight) as well as
// a Package class (ArrayList gift, int totalweight;
// gift objects can be stored in package, as well as their total weight

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
