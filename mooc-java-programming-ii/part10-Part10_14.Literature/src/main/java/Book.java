/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Book {
    private String name;
    private int age;
    
    public Book(String n, int a){
        name = n;
        age = a;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
