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

public class Room {
    private ArrayList<Person> room;
    
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.room;
    }
    
    public Person shortest(){
        if (this.room.isEmpty()){
            return null;
        }
        
        Person shortest = this.room.get(0);
        for (Person one: this.room){
            if (one.getHeight() < shortest.getHeight()){
                shortest = one;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if (this.room.isEmpty()){
            return null;
        }
        
        Person shortest = this.shortest();
        this.room.remove(shortest);
        return shortest;
    }
    
}
