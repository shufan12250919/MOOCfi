
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
            
        while (true) {
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add") && amount > 0){
                if(amount + first >= 100){
                    first = 100;
                } else {
                    first += amount;
                }
            } else if(command.equals("move") && amount > 0){
                if(amount > first){
                    second = first;
                    first = 0;
                } else {
                    second += amount;
                    first = first - amount;
                }
                if(second > 100){
                    second = 100;
                }
            } else if(command.equals("remove") && amount > 0){
                if(amount > second){
                    second = 0;
                }else {
                    second -= amount;
                }
            }
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }

}
