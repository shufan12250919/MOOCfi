/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Hideout <T>{
    private T hide;
    
    
    
    public void putIntoHideout(T toHide){
        hide = toHide;
    }
    
    public T takeFromHideout(){
        T out = hide;
        hide = null;
        return out;
    }
    
    public boolean isInHideout(){
        return hide != null;
    }
}
