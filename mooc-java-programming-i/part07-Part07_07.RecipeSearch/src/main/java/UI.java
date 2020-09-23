/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UI {
    private ArrayList<Recipe> list;
    
    public UI(){
        list = new ArrayList<>();
    }
    
    public void start(Scanner scanner){
        System.out.print("File to read: ");
        String name = scanner.nextLine();
        
        try (Scanner file = new Scanner(Paths.get(name))){
            while (file.hasNextLine()) {
                String title = file.nextLine();
                int time = Integer.valueOf(file.nextLine());
                Recipe one = new Recipe(title, time);
                while (true){
                    String ingredient= file.nextLine();
                    if (ingredient.isEmpty() || !file.hasNextLine()){ // the last empty line is EOL not empty
                        break;
                    }
                    one.addIngre(ingredient);
                }
                list.add(one);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void commandHint(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    public void command(Scanner scanner){
        while (true){
        System.out.println("");
        System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                return;
            }

            if (command.equals("list")){
                System.out.println("");
                this.printlist();
            } else if (command.equals("find name")){
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.find(search);
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxtime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                this.findtime(maxtime);
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ing = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.finding(ing);
            }
        }
    }
    
    public void printlist(){
        System.out.println("Recipes:");
        for (Recipe one: this.list){
            one.print();
        }
        System.out.println("");
    }
    
    public void find(String search){
        for (Recipe one:this.list){
            if (one.getName().contains(search)){
                one.print();
            }
        }
    }
    
    public void findtime(int max){
        for (Recipe one:this.list){
            if (one.getTime() <= max){
                one.print();
            }
        }
    }
    
    public void finding(String ing){
        for (Recipe one:this.list){
            if (one.getIngre().contains(ing)){
                one.print();
            }
        }
    }
    
    
}
