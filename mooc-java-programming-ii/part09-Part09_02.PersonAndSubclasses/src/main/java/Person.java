/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String n, String a){
        name = n;
        address = a;
    }
    
    public String toString(){
        return name + "\n  " + address;
    }
}
