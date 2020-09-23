
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int check = 0;
        int sum = 1;
        int numbers = -1;
        double avg = 0.0;
        int even = 0;
        int odd = 0;
        while (check != -1){
            check = Integer.valueOf(scanner.nextLine());
            sum = sum + check;
            numbers ++;
            avg = sum*1.0/numbers;
            if (check > 0 && check % 2 == 0){
                even++;
            } else if (check > 0){
                odd++;
            }
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
