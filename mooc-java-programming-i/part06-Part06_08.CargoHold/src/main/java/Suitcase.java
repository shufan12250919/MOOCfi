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

public class Suitcase {
    private ArrayList<Item> items;
    private int max;
    
    
    public Suitcase(int max){
        this.max = max;
        this.items = new ArrayList<>();
        
    }
    
    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() <= this.max){
            items.add(item);
            
        }
    }
    
    public String toString(){
        if (this.items.isEmpty()){
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1){
            return "1 item (" + this.totalWeight() +  " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
        
    }
    
    public void printItems(){
        for (Item one: this.items){
            System.out.println(one);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for (Item one: items){
            total = one.getWeight() + total;
        }
        return total;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        
        Item heavy = this.items.get(0);
        for (Item one:this.items){
            if (one.getWeight() > heavy.getWeight()){
                heavy = one;
            }
        }
        return heavy;
    }
}
