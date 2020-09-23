
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int max = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int min = Integer.valueOf(scanner.nextLine());
        if (min <= max){
            for (int i = min; i <= max;i++){
                System.out.println(i);
            }
        }
    
    }
}
