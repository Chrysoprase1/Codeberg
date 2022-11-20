// program that simulates a playing hand holding cards
// hand objects store acrd objects
// cards on one hand can be compared to cards on another hand (value)
// cards on one hand can be sorted by suit as well as by value
    // for this, Card has gotten a overridden compareTo() method
    // value sorting is included in Hand itself
    // sorting by suit included via new class as I cant stack compareTo() methods

public class Main {

    public static void main(String[] args) {
        
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sort();

        hand.print();
        
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }
        
        Hand hand4 = new Hand();

        hand4.add(new Card(12, Suit.HEART));
        hand4.add(new Card(4, Suit.SPADE));
        hand4.add(new Card(2, Suit.DIAMOND));
        hand4.add(new Card(14, Suit.SPADE));
        hand4.add(new Card(7, Suit.HEART));
        hand4.add(new Card(2, Suit.SPADE));

        hand4.sortBySuit();

        hand4.print();
    }
}
