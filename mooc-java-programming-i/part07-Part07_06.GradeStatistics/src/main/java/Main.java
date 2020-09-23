
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Scores scores = new Scores();
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1){
                break;
            }
            if (point >= 0 && point <= 100){
                Score input = new Score(point);
                scores.add(input);
            }
        }
        System.out.print("Point average (all): ");
        System.out.println(scores.avg());
        System.out.print("Point average (passing): ");
        if (scores.gAvg() == 0.0){
            System.out.println("-");
        } else {
            System.out.println(scores.gAvg());
        }
        System.out.print("Pass percentage: ");
        System.out.println(scores.passPercent());
        scores.printGrades();
        
    }
}
