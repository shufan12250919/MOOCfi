import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("");
        System.out.print("What information will be printed? ");
        String ans = scanner.nextLine();
        if (ans.equals("everything")){
            for (Book one:books){
                System.out.println(one);
            }
        } else if (ans.equals("name")){
            for (Book one:books){
                System.out.println(one.getName());
            }
        }
    }
}
