
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> shelf =  new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            String input2 = scanner.nextLine();
            int age = Integer.valueOf(input2);
            shelf.add(new Book(input, age));
        }
        
        System.out.println();
        System.out.println(shelf.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(shelf, comparator);
        
        for(Book b : shelf){
            System.out.println(b.getName() + " (recommend for " + b.getAge() + " year-olds or older");
        }
    }

}
