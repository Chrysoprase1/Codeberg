import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList () {
        this.list = new ArrayList<>();
    }
    
    public void add (String task) {
        list.add (task);
    }
    
    public void remove (int index) {
        list.remove (index - 1);
    }
    
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i+1 + ": ");
            System.out.println(list.get (i));
        }
    }
    
    public int size() {
        return list.size();
    }
    
}
