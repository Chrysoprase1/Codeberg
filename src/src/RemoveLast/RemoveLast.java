// program that removes last entry from given list
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList <String> lists = new ArrayList<>();
       
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
        strings.remove (strings.size() - 1);
        }
    }
}
