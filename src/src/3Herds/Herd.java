import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd (Movable movable) {
        this.herd.add (movable);
    }
    
    public void move (int moveX, int moveY) {
        for (Movable unit : this.herd) {
            unit.move (moveX, moveY);
        }
    }
    
    public int getX() {
        return 0;
    }
    
    public int getY() {
        return 0;
    }
    
    public String toString() {
        String returnThis = "";
        for (Movable unit : this.herd) {
            returnThis += "x: " + unit.getX() + "; y: " + unit.getY() + "\n";
        }
        
        return returnThis;
    }
}
