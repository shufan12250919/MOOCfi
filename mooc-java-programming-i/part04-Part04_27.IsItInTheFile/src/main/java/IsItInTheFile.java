
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean found = false;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (reader.hasNextLine()) {
                String word = reader.nextLine();
                if (word.equals(searchedFor)){
                    found = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+ file +" failed.");
        }
        
        if (found == true){
            System.out.println("Found!");
        } else{
            System.out.println("Not found.");
        }
    }
}
