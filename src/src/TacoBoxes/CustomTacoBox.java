
public class CustomTacoBox implements TacoBox {
    private int tacos;
    
    public CustomTacoBox (int tacos) {
        this.tacos = tacos;
    }
    
    public void eat() {
        if (this.tacos > 0) {
            this.tacos = this.tacos - 1;
        }
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
}
