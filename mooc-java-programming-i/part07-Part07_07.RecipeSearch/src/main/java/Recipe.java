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
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredient;
    
    public Recipe(String name, int time){
        this.name = name;
        this.time = time;
        this.ingredient = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getTime(){
        return this.time;
    }
    
    public ArrayList<String> getIngre(){
        return this.ingredient;
    }
    
    public void addIngre(String ingre){
        this.ingredient.add(ingre);
    }
    
    public void print(){
        System.out.println(this.name + ", cooking time: " + this.time);
    }
}
