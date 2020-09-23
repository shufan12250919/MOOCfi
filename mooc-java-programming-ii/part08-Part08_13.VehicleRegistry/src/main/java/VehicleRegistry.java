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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> reg;
    
    public VehicleRegistry(){
        reg = new HashMap<>();
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!reg.keySet().contains(licensePlate)){
            reg.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate){
        return reg.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!reg.keySet().contains(licensePlate)){
           return false; 
        }
        reg.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l : reg.keySet()){
            System.out.println(l);
        }
    }
    
    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();
        for(String name:reg.values()){
            if(!list.contains(name)){
                list.add(name);
            }
        }
        for(String name:list){
            System.out.println(name);
        }
    }
    
}
