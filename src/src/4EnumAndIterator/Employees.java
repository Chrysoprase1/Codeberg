import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> list;
    
    public Employees () {
        this.list = new ArrayList<>();
    }
    
    public void add (Person addPerson) {
        list.add (addPerson);
    }
    
    public void add (List<Person> addList) {
        for (Person singlePerson : addList) {
            list.add (singlePerson);
        }
    }
    
    public void print() {
        // list.stream().forEach (s -> System.out.println(s)); 
        Iterator <Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print (Education education) {
        if (list.isEmpty()) {
            System.out.println("");
        }
        
        Iterator <Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals (education)) {
                System.out.println(person);
            } 
        }
    }
    
    public void fire (Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals (education)) {
                iterator.remove ();
            }
        }
    }
}
