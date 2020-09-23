
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true){
            
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")){
                break;
            } else if (command.equals("Add")){
                System.out.println("Name: ");
                String birdname = scan.nextLine();
                System.out.println("Name in Latin: ");
                String birdlatin = scan.nextLine();
                Bird newone = new Bird(birdname, birdlatin);
                birds.add(newone);
            } else if (command.equals("Observation")){
                System.out.println("Bird? ");
                String obser = scan.nextLine();
                for (Bird one:birds){
                    if (one.getName().equals(obser)){
                        one.addObser();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (command.equals("All")){
                for (Bird one:birds){
                    System.out.println(one.getName() + " (" + one.getLatin() + "): " + one.getObser() + "observations");
                }
                
            } else if (command.equals("One")){
                 System.out.println("Bird? ");
                String obser = scan.nextLine();
                for (Bird one:birds){
                    if (one.getName().equals(obser)){
                            System.out.println(one.getName() + " (" + one.getLatin() + "): " + one.getObser() + "observations");
                        }
                }         
            }
        }
    }

}
