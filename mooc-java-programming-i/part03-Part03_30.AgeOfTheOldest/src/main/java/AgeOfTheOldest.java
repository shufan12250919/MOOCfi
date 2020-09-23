
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        int old = 0;
        while (true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }
            String[] word = line.split(",");
            if (first == true){
                old = Integer.valueOf(word[1]);
                first = false;
            }
            if (Integer.valueOf(word[1]) > old){
                old = Integer.valueOf(word[1]);
            }
        }
        System.out.println("Age of the oldest: " + old);

    }
}
