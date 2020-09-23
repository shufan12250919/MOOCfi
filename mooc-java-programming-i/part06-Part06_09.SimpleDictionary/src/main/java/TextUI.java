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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dic;
    
    public TextUI(Scanner scanner, SimpleDictionary dic){
        this.scanner = scanner;
        this.dic = dic;
    }
    
    public void start(){
        System.out.print("Command: ");
        while(true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            } else if (command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String trans = scanner.nextLine();
                this.dic.add(word, trans);
                
            } else if (command.equals("search")){
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                if (this.dic.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + this.dic.translate(search));
                }
                
            } else{
                System.out.println("Unknown command");
            }
            
        }
        
        System.out.println("Bye bye!");
    }
    
    
}
