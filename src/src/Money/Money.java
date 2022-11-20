
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus (Money addition) {
        int euroAdd = this.euros + addition.euros;
        int centAdd = this.cents + addition.cents;
        Money newMoney = new Money (euroAdd, centAdd);
        return newMoney;
    }
    
    public Money minus (Money substraction) {
        
        int euroSub = this.euros - substraction.euros;
        int centSub = this.cents - substraction.cents;
        
        if (centSub < 0) {
            euroSub = euroSub - (1 + (centSub / 100));
            centSub = centSub + 100;
        }
        
        if (this.euros < substraction.euros ||
                this.euros == substraction.euros &&
                this.cents < substraction.cents) {
            euroSub = 0;
            centSub = 0;
        }
        
        Money newMoney = new Money (euroSub, centSub);
        return newMoney;
    }
    
    public boolean lessThan (Money compared) {
        
        if (this.euros < compared.euros) {
            return true;
        } 
        
        if (this.euros == compared.euros && 
                this.cents < compared.euros) {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
