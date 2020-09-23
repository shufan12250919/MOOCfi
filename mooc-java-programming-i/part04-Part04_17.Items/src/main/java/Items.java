
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            Item newone = new Item(name);
            items.add(newone);
            
        
        }
        
        for (Item one: items){
            System.out.println(one);
        }
    }
}
