
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

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    public boolean equals (Object object) {
        if (object == this) {
            return true;
        }
        
        if (!(object instanceof SimpleDate)) {
            return false;
        }
        
        SimpleDate compareDate = (SimpleDate) object;
        if (compareDate.year == this.year &&
            compareDate.month == this.month &&
            compareDate.day == this.day) {
            return true;
        }
        
        if (this.hashCode() == compareDate.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.day;
        hash = 47 * hash + this.month;
        hash = 47 * hash + this.year;
        return hash;
    }
    
}
