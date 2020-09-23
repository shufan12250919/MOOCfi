/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Timer {
    private ClockHand hundre;
    private ClockHand second;
    
    public Timer(){
        this.hundre = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public void advance(){
        this.hundre.advance();
        if (this.hundre.value() == 0){
            this.second.advance();
        }
    }
    
    public String toString(){
        return this.second.toString() + ":" + this.hundre.toString();
    }
}
