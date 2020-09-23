/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public abstract class Animal {
    
    private String name;
    
    public Animal(String n){
        name = n;
    }
    
    public void eat(){
        System.out.println(name + " eats");
    }
    
    public void sleep(){
        System.out.println(name + " sleeps");
    }
    
    public String getName(){
        return name;
    } 
}
