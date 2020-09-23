/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class TripleTacoBox implements TacoBox{
    int tacos;
    
    public TripleTacoBox(){
        tacos = 3;
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
