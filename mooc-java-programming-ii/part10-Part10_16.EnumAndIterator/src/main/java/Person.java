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
    private Education degree;
    
    public Person(String n, Education e){
        name = n;
        degree = e;
    }
    
    public Education getEducation(){
        return degree;
    }
    
    @Override
    public String toString(){
        return name + ", " + degree;
    }
}
