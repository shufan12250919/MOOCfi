
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        double avg = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            
            sum = sum + num;
            total = total + 1;
            avg = sum / (total*1.0);
            
        }
        
        System.out.println("Average of the numbers: " + avg);
    }
}
