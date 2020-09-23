/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author linshu-fan
 */
public class StandardSensor implements Sensor{
    private int value;
    
    public StandardSensor(int num){
        value = num;
    }
    
    
    public boolean isOn(){
        return true;
    }
    public void setOn(){
        return;
    }
    public void setOff(){
        return;
    }
    public int read(){
        return value;
    }
}
