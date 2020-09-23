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

public class ShoppingCart {
    private Map<String, Item> map;
    
    public ShoppingCart(){
        map = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(map.containsKey(product)){
            map.get(product).increaseQuantity();
        } else {
            Item i = new Item(product, 1, price);
            map.put(product, i);
        }
        
    }
    
    public int price(){
        int total = 0;
        for(Item item : map.values()){
            total += item.price();
        }
        return total;
    }
    
    public void print(){
        for(String name : map.keySet()){
            System.out.println(map.get(name));
        }
    }
}
