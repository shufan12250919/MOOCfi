
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
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
                
    }
    
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros()){
            return true;
        } else if (this.cents < compared.cents() && this.euros == compared.euros()){
            return true;
        } else{
            return false;
        }
    }
    
    public Money minus(Money decreaser){
        int newe = this.euros;
        int newc = this.cents;
        if (!this.lessThan(decreaser)){
            if(this.cents < decreaser.cents()){
                newe = this.euros - 1;
                newc = 100+ this.cents;
            } 
            Money newMoney = new Money(newe - decreaser.euros(), newc - decreaser.cents());
            return newMoney;
        }
        Money zero = new Money(0,0);
        return zero;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
