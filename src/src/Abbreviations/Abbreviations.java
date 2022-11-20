import java.util.HashMap;
        
public class Abbreviations {
    private HashMap<String, String> list;
    
    public Abbreviations() {
        this.list = new HashMap<>();
    }
    
    public void addAbbreviation (String abbreviation, String meaning) {
        this.list.put (abbreviation, meaning);
    }
    
    public boolean hasAbbreviation (String abbreviation) {
        return this.list.containsKey (abbreviation);
    }
    
    public String findExplanationFor (String abbreviation) {
        if (!this.list.containsKey (abbreviation)) {
            return null;
        }
        return list.get (abbreviation);
    }
}
