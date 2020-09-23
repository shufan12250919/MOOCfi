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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokemanager;
    
    public JokeManager(){
        jokemanager = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokemanager.add(joke);
    }
    
    public String drawJoke(){
        if (jokemanager.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokemanager.size());
        return jokemanager.get(index);
    }
    
    public void printJokes(){
        for (String joke: jokemanager){
            System.out.println(joke);
        }
    }
}
