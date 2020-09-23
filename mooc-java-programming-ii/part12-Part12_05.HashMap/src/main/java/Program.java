
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.add(1, 2);
        map.add(2, 3);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        map.remove(2);
        System.out.println(map.get(2));
        System.out.println(map.get(1));
       
        
    }

}
