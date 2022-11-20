
package application;

public class StandardSensor implements Sensor{
    private int temperature;
    
    public StandardSensor (int temperature) {
        this.temperature = temperature;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn() {
        
    }
        
        
    
    
    public void setOff() {
        
    }
    
    public int read() {
        return this.temperature;
    }
    
}
