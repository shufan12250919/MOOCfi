/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    private double weight;
    
    public CD(String a, String n, int y){
        artist = a;
        name = n;
        year = y;
        weight = 0.1;
    }
    
    public double weight(){
        return weight;
    }
    
    @Override
    public String toString(){
        return artist + ": " + name + " (" + year + ")";
    }
    
}
