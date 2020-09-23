
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }
            String[] pieces = line.split(" ");
            for (int i = 0; i < pieces.length; i ++){
                System.out.println(pieces[i]);
            }
        }

    }
}
