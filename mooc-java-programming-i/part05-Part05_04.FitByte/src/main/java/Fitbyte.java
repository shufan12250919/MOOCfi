/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Fitbyte {
    private int age;
    private int rest;
    
    public Fitbyte(int age, int rest){
        this.age = age;
        this.rest = rest;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711 * this.age);
        double target = (max - this.rest) *  percentageOfMaximum  + this.rest;
        return target;
    }
    
    
}
