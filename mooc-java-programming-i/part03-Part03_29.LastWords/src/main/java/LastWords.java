
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }
            String[] word = line.split(" ");
            System.out.println(word[(word.length - 1)]);
        }

    }
}
