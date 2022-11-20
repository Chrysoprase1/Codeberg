

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack () {
        this.list = new ArrayList<String>();
    }
    
    public void add (String add) {
        this.list.add (add);
    }
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (String strings : this.list) {
            values.add (strings);
        }
        return values;
    }
    
    public String take() {
        return this.list.remove (list.size() - 1);
    }
}
