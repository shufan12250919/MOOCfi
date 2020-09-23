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

public class ChangeHistory {
    private ArrayList<Double> list;
            
    public ChangeHistory(){
        list = new ArrayList<>();
    }
    
    public void add(double status){
        list.add(status);
    }
    
    public void clear(){
        list = new ArrayList<>();
    }
    
    public String toString(){
        return list.toString();
    }
    
    public double maxValue(){
        if(list == null || list.size() == 0){
            return 0.0;
        }
        double max = list.get(0);
        for(int i =1; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
    
    public double minValue(){
        if(list == null || list.size() == 0){
            return 0.0;
        }
        double min = list.get(0);
        for(int i =1; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    
    public double average(){
        if(list ==  null || list.size() == 0){
            return 0.0;
        }
        double total = 0.0;
        for(int i =0; i < list.size(); i++){
            total += list.get(i);
        }
        return total / list.size();
    }
    
}
