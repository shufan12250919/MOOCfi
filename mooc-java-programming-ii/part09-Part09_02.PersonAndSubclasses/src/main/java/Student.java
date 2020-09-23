/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Student extends Person{
    private int credit;
    
    public Student(String n, String a){
        super(n, a);
        credit = 0;
    }
    
    public int credits(){
        return credit;
    }
    
    public void study(){
        credit++;
    }
    
    public String toString(){
        return super.toString() + "\n  Study credits " + credit;
    }
}
