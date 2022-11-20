

import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    
    
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        
        if (!(object instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate comparePlate = (LicensePlate) object;
        if (this.liNumber == comparePlate.liNumber &&
            this.country == comparePlate.country) {
            return true;
        } 
        
        if (this.hashCode() == comparePlate.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 15;
        hash = 79 * hash + Objects.hashCode(this.liNumber);
        hash = 79 * hash + Objects.hashCode(this.country);
        return hash;
    }
    
    
}
