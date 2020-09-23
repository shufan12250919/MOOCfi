
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            list.add(id+": " + name);
        }
        
        System.out.println("");
        System.out.println("==Items==");
        ArrayList <String> print = new ArrayList<>();
        for (String line:list){
            String[] ids = line.split(":");
            if (!print.contains(ids[0])){
                System.out.println(line);
            }
            print.add(ids[0]);
        }


    }
}
