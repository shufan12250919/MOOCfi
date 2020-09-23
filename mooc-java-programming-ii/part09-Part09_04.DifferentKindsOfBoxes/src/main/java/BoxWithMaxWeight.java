/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.*;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int c){
        capacity = c;
        items = new ArrayList<>();
    }
    
    public void add(Item item){
        int total = 0;
        for(Item i : items){
            total += i.getWeight();
        }
        if(total + item.getWeight() <= capacity){
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        return items.contains(item);
    }
}
