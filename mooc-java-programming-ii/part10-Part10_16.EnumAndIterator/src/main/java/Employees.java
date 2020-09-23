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

public class Employees {
    private ArrayList<Person> list;
    
    public Employees(){
        list = new ArrayList<>();
    }
    
    public void add(Person p){
        list.add(p);
    }
    
    public void add(List<Person> l){
        for(Person p:l){
            list.add(p);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }
    
    public void print(Education ed){
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation() == ed){
                System.out.println(nextInLine);
            }
        }
    }
    
    public void fire(Education ed){
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == ed) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
        }
    }
}
