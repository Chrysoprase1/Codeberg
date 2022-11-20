
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance() {
        if (this.day == 30) {
            this.day = 0;
            
            if (this.month == 12) {
                this.month = 0;
                this.year = this.year + 1;
            }
            
            this.month = this.month + 1;
        }
        
        this.day = this.day + 1;
    }
    
    public void advance (int days) {
        for (int i = 0; i < days; i++) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays (int days) {
        SimpleDate cloneDate = new SimpleDate (this.day, this.month, this.year);
        cloneDate.advance (days);
        return cloneDate;
    }
    
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
