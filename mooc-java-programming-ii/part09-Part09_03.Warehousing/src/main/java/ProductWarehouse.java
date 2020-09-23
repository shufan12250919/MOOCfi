/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class ProductWarehouse extends Warehouse{
    private String product;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        product = productName;
        
    }
    
    public String getName(){
        return product;
    }
    
    public void setName(String newName){
        product = newName;
    }
    
    @Override
    public String toString(){
        return getName() + ": " + super.toString();
    }
}
