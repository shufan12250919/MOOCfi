
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        double avg = 0;
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            if (num > 0){
                sum = sum + num;
                total = total + 1;
                avg = sum / (total*1.0);
            }
            
        }
        if (total == 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(avg);
        }
    }
}
