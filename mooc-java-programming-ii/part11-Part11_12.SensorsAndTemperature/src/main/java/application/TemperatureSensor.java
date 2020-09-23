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
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean on;
    
    public TemperatureSensor(){
        on = false;
    }
    
    
    public boolean isOn(){
        return on;
    }
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    public int read(){
        if(on){
            int r = new Random().nextInt(61) - 30;
            return r;
            
        }else{
            throw new IllegalStateException("The sensor is not on!");
        }
        
    }
}
