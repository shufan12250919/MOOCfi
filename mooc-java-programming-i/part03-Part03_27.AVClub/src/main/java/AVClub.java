
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String sentence = scanner.nextLine();
            if (sentence.equals("")){
                break;
            }
            
            String[] word = sentence.split(" ");
            for (String word1 : word) {
                if (word1.contains("av")) {
                    System.out.println(word1);
                }
            }
        }

    }
}
