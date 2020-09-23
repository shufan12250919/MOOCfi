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

public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd(){
        list = new ArrayList<>();
    }
    
    public void addToHerd(Movable m){
        list.add(m);
    }
    
    public void move(int dx, int dy){
        for(Movable m : list){
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Movable m :list){
            s.append(m);
            s.append("\n");
        }
        return s.toString();
    }
}
