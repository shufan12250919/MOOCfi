/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linshu-fan
 */
public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reads;
    
    public AverageSensor(){
        sensors = new ArrayList<>();
        reads = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    
    public boolean isOn(){
        for(Sensor s : sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }
    public void setOn(){
        for(Sensor s : sensors){
            s.setOn();
        }
    }
    public void setOff(){
        for(Sensor s : sensors){
            s.setOff();
        }
    }
    public int read(){
        int all = 0;
        for(Sensor s : sensors){
            if(!s.isOn()){
                throw new IllegalStateException();
            }
            all += s.read();
        }
        reads.add(all/sensors.size());
        return all / sensors.size();
        
    }
    
    public List<Integer> readings(){
        

        return reads;
    }
}
