
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int len = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }
            if(num > 0) {
                total += num ;
                len++;
            }
        }
        
        if(len == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = total * 1.0 / len ;
            System.out.println(avg);
        }
    }
}
