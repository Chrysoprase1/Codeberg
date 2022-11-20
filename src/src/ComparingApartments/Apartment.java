
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan (Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference (Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int priceDifference = ownPrice - comparedPrice;
        
        if (priceDifference < 0) {
            priceDifference = priceDifference * (-1);
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan (Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        
        if (ownPrice > comparedPrice) {
            return true;
        }
        
        return false;
    }

}
