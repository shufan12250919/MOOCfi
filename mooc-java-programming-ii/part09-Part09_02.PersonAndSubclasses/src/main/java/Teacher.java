/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String n, String a, int s){
        super(n, a);
        salary = s;
    }
    
    public String toString(){
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
}
