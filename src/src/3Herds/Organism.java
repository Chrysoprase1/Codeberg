
public class Organism implements Movable {
    private int positionX;
    private int positionY;
    
    public Organism (int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public void move (int moveX, int moveY) {
        this.positionX += moveX;
        this.positionY += moveY;
    }
    
    public int getX() {
        return this.positionX;
    }
    
    public int getY() {
        return this.positionY;
    }
    
    public String toString() {
        return "x: " + this.positionX + "; y: " + this.positionY;
    }
}
