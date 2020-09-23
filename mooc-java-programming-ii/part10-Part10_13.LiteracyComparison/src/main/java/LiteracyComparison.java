
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String[]> rows = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row.split(",")));
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        rows.stream()
                .sorted((c1, c2) -> {
                    return Double.valueOf(c1[5]).compareTo(Double.valueOf(c2[5])); 
                }).forEach(c -> System.out.println(c[3] + " (" + c[4] + "), "
                        + c[2].trim().split(" ")[0] + ", " + c[5]));
        
    }
}
