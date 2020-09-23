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

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Warehouse(){
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }
    
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(prices.containsKey(product)){
            return prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stocks.get(product) == null || stocks.get(product) == 0){
            return false;
        }
        stocks.put(product, stocks.get(product) - 1);
        return true;
    }
    
    public Set<String> products(){
        return prices.keySet();
    }
    
    
}
