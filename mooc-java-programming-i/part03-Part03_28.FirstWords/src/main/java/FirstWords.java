
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String sentence = scanner.nextLine();
            if (!sentence.equals("")){
            } else {
                break;
            }
            String[] word = sentence.split(" ");
            System.out.println(word[0]);
        }

    }
}
