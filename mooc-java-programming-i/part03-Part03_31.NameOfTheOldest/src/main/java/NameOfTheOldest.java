
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        int old = 0;
        String name = " ";
        while (true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }
            String[] word = line.split(",");
            if (first == true){
                old = Integer.valueOf(word[1]);
                name = word[0];
                first = false;
            }
            if (Integer.valueOf(word[1]) > old){
                old = Integer.valueOf(word[1]);
                name = word[0];
            }
        }
        System.out.println("Age of the oldest: " + name);

    }
}
