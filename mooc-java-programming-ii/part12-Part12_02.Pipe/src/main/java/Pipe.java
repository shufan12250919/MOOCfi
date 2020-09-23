/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.ArrayList;

public class Pipe <T>{
    private ArrayList<T> pipe;
    
    public Pipe(){
        pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(pipe.size() == 0) return null;
        T out = pipe.get(0);
        pipe.remove(0);
        return out;
    }
    
    public boolean isInPipe(){
        return pipe.size() != 0;
    }
    
}
