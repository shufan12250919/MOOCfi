
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        
        System.out.println("Print the average of the nagative numbers or the positive number? (n/p)");
        String choice = scanner.nextLine();
        
        if(choice.equals("p")){
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(k -> k > 0)
            .average()
            .getAsDouble();
        
            System.out.println("Average of the positive numbers: " + average);
        } else {
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(k -> k < 0)
            .average()
            .getAsDouble();
        
            System.out.println("Average of the negative numbers: " + average);
        }

    }
}
