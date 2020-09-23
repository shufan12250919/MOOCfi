/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(int num){
        if (num > 0){
            this.value += num;
        }
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(int num){
        if (num > 0){
            this.value -= num;
        }
    }
    
    public void decrease(){
        this.decrease(1);
    }
}
