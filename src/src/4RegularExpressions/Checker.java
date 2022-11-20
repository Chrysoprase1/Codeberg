

public class Checker {
    private String check;
    
    public Checker () {
    }
    
    public Checker (String string) {
        this.check = string;
    }

    
    public boolean isDayOfWeek(String input) {
        if (input.matches ("")) {
            return false;
        }
        if (input.matches ("mon||tue||wed||thu||fri||sat||sun")) {
            return true;
        }
        return false;
    }
    
    public boolean allVowels (String input) {
        if (input.matches ("")) {
            return false;
        }
        if (input.matches ("[aeiouu]+")) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay (String input) {
        if (input.matches ("")) {
            return false;
        }
        // 00:00:00 - 23:59:59 
        if (input.matches ("(((0|1)[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        }
        return false;
    }
}
