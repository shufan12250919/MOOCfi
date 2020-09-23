/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int t){
        tacos = t;
    }
    
    public int tacosRemaining(){
        return tacos;
    }

    public void eat(){
        if(tacos > 0){
            tacos--;
        }
    }
}
