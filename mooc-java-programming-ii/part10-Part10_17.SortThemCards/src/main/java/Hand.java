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

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> list;
    
    public Hand(){
        list = new ArrayList<>();
    }
    
    public void add(Card c){
        list.add(c);
    }
    
    public void print(){
        Iterator<Card> iterator = list.iterator();

        while (iterator.hasNext()) {
            Card c = iterator.next();
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(list);
    }
    
    @Override
    public int compareTo(Hand h){
        int sum1 = 0;
        for(Card c : list){
            sum1 += c.getValue();
        }
        int sum2 = 0;
        for(Card c : h.list){
            sum2 += c.getValue();
        }
        return sum1 - sum2;
    }
    
    public void sortBySuit(){
        Collections.sort(list, new BySuitInValueOrder());
    }
}
