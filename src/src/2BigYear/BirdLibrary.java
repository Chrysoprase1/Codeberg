import java.util.ArrayList;

public class BirdLibrary {
    private ArrayList<Bird> birds;
    
    public BirdLibrary() {
        this.birds = new ArrayList<>();
    }
    
    public void add (String name, String latinName) {
        birds.add (new Bird (name, latinName));
    }
    
    public void add (Bird bird) {
        birds.add (bird);
    }
    
    
    public ArrayList<Bird> getBirds() {
        return this.birds;
    }
    
    public boolean containsBird (String name) {
        for (Bird singleBird : birds) {
            if (singleBird.isBird (name)) {
                return true;
            }
        }
        return false;
    }
    
    public void printByName(String name) {
        for (Bird singleBird : birds) {
            if (singleBird.getName().equals (name)) {
                System.out.println(singleBird.toString());
            }
        }
    }
    
    public void observeByName(String name) {
        for (Bird singleBird : birds) {
            if (singleBird.getName().equals (name)) {
                singleBird.doObservations();
            }
        }
    }
    
    public void printAll() {
        for (Bird singleBird : birds) {
            System.out.println(singleBird.toString());
        }
    }
}
