/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Book implements Packable{
    private String author;
    private String name;
    private double weight;
    
    public Book(String a, String n, double w){
        author = a;
        name = n;
        weight = w;
    }
    
    public double weight(){
        return weight;
    }
    
    @Override
    public String toString(){
        return author + ": " + name;
    }
}
