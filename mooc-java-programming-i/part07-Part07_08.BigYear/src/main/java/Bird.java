/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Bird {
    private String name;
    private String latin;
    private int observation;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatin(){
        return this.latin;
    }
    
    public int getObser(){
        return this.observation;
    }
    
    public void addObser(){
        this.observation ++;
    }
}
