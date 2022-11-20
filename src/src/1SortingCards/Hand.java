import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> list;
    
    public Hand() {
        this.list = new ArrayList<>();
    }
    
    public void add (Card card) {
        this.list.add (card);
    }
    
    public void print() {
        Iterator<Card> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing (Card :: getValue)
                .thenComparing (Card :: getSuit);
        
        Collections.sort(list, comparator);
    }
    
    public int compareTo (Hand otherHand) {
        int fullValue = 0;
        int otherHandFullValue = 0;
        
        // stack values into a full value int and compare them
        // return 0 on equal, + on higher (this) or - on lower (this)
        for (Card singleCard : this.list) {
            fullValue += singleCard.getValue();
        }
        
        for (Card singleCard : otherHand.list) {
            otherHandFullValue += singleCard.getValue();
        }
        
        if (fullValue == otherHandFullValue) {
            return 0;
        } else {
            return fullValue - otherHandFullValue;
        }
    }
    
    public void sortBySuit() {
        Collections.sort (this.list, new BySuitInValueOrder());
    }
}
