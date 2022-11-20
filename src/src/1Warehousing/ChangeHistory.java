import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory () {
        this.list = new ArrayList<>();
    }
    
    public void add (double status) {
        list.add (status);
    }
    
    public void clear() {
        this.list.clear();
    }
    
    public double maxValue() {
        double number = 0.0;
        for (double doubles : list) {
            if (doubles > number) {
                number = doubles;
            }
        }
        return number;
    }
    
    public double minValue() {
        if (list.isEmpty()) {
            return 0.0;
        }
        
        double number = list.get (0);
        for (double doubles : list) {
            if (doubles < number && doubles != 0.0) {
                number = doubles;
            }
        }
        return number;
    }
    
    public double average() {
        double value = 0.0;
        for (double doubles : list) {
            value+= doubles;
        }
        
        return (value / list.size());
    }
    
    public String toString() {
        return this.list.toString();
    }
}
