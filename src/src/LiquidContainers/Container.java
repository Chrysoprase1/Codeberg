
public class Container {
    private int value;
    
    public Container () {
        this.value = 0;
    }
    
    public int contains() {
        return this.value;
    }
    
    public void add (int add) {
        if (add < 0) {
            add = 0;
        }
        this.value = this.value + add;
        if (this.value > 100) {
            this.value = 100;
        }
    }
    
    public void remove (int remove) {
        if (remove < 0) {
            this.value = this.value;
        }
        this.value = this.value - remove;
        if (this.value < 0) {
            this.value = 0;
        }
    }
    
    public String toString() {
        return this.value + "/100";
    }
}
