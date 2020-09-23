
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        int longest = 0;
        String name = " ";
        int sum = 0;
        int numbers = 0;
        double avg = 0.0;
        while (true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }
            String[] word = line.split(",");
            if (first == true){
                longest = word[0].length();
                name = word[0];
                first = false;
            }
            if (word[0].length() > longest){
                longest = word[0].length();
                name = word[0];
            }
            sum = sum + Integer.valueOf(word[1]);
            numbers ++;
        }
        avg = 1.0* sum/ numbers;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);

    }
}
