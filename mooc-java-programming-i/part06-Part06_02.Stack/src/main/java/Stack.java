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

public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.stack.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    
    public void add(String value){
        this.stack.add(value);
    }
   
    public ArrayList<String> values() {
        return new ArrayList<>(this.stack);
    }
    
    public String take(){
        String taken = this.stack.get(this.stack.size() - 1);
        this.stack.remove(taken);
        return taken;
    }
    
}
