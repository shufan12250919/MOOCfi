
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            int value = Integer.valueOf(input);
            if(value < 0){
                break;
            }
            list.add(value);
        }
        
        list.stream()
            .filter(s -> s >= 1 && s <= 5)
            .forEach(v -> System.out.println(v));

    }
}
