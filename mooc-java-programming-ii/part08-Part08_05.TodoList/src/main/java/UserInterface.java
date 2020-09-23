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

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList l, Scanner s){
        list = l;
        scan = s;           
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scan.nextLine();
            if(command.equals("stop")){
                break;
            } else if (command.equals("add")){
                System.out.println("To add: ");
                String task = scan.nextLine();
                list.add(task);
            } else if (command.equals("list")){
                list.print();
            } else if (command.equals("remove")){
                System.out.println("Which one is removes?");
                int num = Integer.valueOf(scan.nextLine());
                list.remove(num);
            }
        }
    }
}
