
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int fac = 1;
        for (int i = 1; i <= num; i++){
            fac = fac * i;
        }
        System.out.println("Factorial: " + fac);
    }
}
