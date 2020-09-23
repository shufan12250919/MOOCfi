/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.ArrayList;

public class Hold {
    private int max;
    private ArrayList<Suitcase> cases;
    private int carry;
    
    public Hold(int max){
        this.max = max;
        this.cases = new ArrayList<>();
        this.carry = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.carry + suitcase.totalWeight() <= max){
            this.cases.add(suitcase);
            this.carry += suitcase.totalWeight();
        }
        
    }
    
    public String toString(){
        return this.cases.size() + " suitcases (" + this.carry + " kg)";
    }
    
    public void printItems(){
        for (Suitcase one: this.cases){
            one.printItems();
               
            }
    }
}
