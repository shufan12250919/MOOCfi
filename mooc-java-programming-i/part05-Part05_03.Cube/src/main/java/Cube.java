/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Cube {
    private int edge;
    
    public Cube(int edge){
        this.edge = edge;
    }
    
    public int volume(){
        return this.edge * this.edge * this.edge;
    }
    
    public String toString(){
        return "The length of the edge is "+ this.edge +" and the volume " + volume();
    }
    
}
