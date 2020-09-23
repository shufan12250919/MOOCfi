package title;
import javafx.application.Application;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the name of title:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String course = "--title=" + name;
        Application.launch(UserTitle.class, course);
    }

}
