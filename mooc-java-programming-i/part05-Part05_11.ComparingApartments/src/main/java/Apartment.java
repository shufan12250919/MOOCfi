
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int one = this.princePerSquare * this.squares;
        int two = compared.princePerSquare * compared.squares;
        if (one - two > 0){
            return one - two;
        } else {
            return -1*(one - two);
        }
        
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int one = this.princePerSquare * this.squares;
        int two = compared.princePerSquare * this.squares;
        if (one > two){
            return true;
        }
        return false;
    }
}
