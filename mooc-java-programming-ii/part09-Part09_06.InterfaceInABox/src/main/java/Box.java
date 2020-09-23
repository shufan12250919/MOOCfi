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

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double c){
        capacity = c;
        list = new ArrayList<>();
    }
    
    public void add(Packable p){
        double amount = weight();
        if(amount + p.weight() < capacity){
            list.add(p);
        }
    }
    
    public double weight(){
        double total = 0.0;
        for(Packable p : list){
            total += p.weight();
        }
        return total;
    }
    
    
    @Override
    public String toString(){
        return "Box: " + list.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
