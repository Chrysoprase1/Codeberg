import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap <String, ArrayList<String>> list;
    
    public DictionaryOfManyTranslations() {
        this.list = new HashMap<>();
    }
    
    public void add (String word, String translation) {
        // create new list if not existing
        this.list.putIfAbsent (word, new ArrayList<String>());
        // add the translation to the list
        // list is found via hashmap (list.get(word)
        this.list.get (word).add (translation);
    }
    
    public ArrayList<String> translate (String word) {
        if (!(this.list.containsKey (word))) {
            this.list.put (word, new ArrayList<String>());
        }
        
        return this.list.get (word);
    }
    
    public void remove (String word) {
        this.list.remove (word);
    }
}
