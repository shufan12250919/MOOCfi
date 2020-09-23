/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Item {
    private String name;
    private int quantity;
    private int unitP;
    
    public Item(String product, int qty, int unitPrice){
        name = product;
        quantity = qty;
        unitP = unitPrice;
    }
    
    public int price(){
        return unitP * quantity;
    }
    
    public void increaseQuantity(){
        quantity++;
    }
    
    @Override
    public String toString(){
        return name + ": " + quantity;
    }
    
    
}
