import java.util.ArrayList;


public class Room {
    private ArrayList<Person> list;
    
    public Room () {
        this.list = new ArrayList<Person>();
    }
    
    public void add (Person add) {
        this.list.add (add);
    }
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = list.get (0);
        for (Person person : list) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = list.get (0);
        int shortestIndex = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (shortest.getHeight() > list.get (i).getHeight()) {
                shortest = list.get (i);
                shortestIndex = i;
            }
        }
        return list.remove(shortestIndex);
    }
}
