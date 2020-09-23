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

public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility(){
        map = new HashMap<>();
    }
    
    public void add(String unit, String item){
        map.putIfAbsent(unit, new ArrayList<>());
        map.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit){
        if(map.containsKey(unit)){
            return map.get(unit);
        }
        return new ArrayList<String>();
    }
    
    public void remove(String storageUnit, String item){
        map.get(storageUnit).remove(item);
        if(map.get(storageUnit).isEmpty()){
            map.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for(String key: map.keySet()){
            list.add(key);
        }
        return list;
    }
    
}
