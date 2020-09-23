
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int numOfGame = 0;
        int numOfWin = 0;
        int numOfLose = 0;
        try (Scanner reader = new Scanner(Paths.get(file))){
            
            while (reader.hasNextLine()){
                String[] line = reader.nextLine().split(",");
                if (line[0].equals(team)){
                    numOfGame ++;
                    if (Integer.valueOf(line[2]) > Integer.valueOf(line[3])){
                        numOfWin ++;
                    } else{
                        numOfLose ++;
                    }
                } else if (line[1].equals(team)){
                    numOfGame ++;
                    if (Integer.valueOf(line[2]) < Integer.valueOf(line[3])){
                        numOfWin ++;
                    } else{
                        numOfLose ++;
                    }
                }
            } 
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + numOfGame);
        System.out.println("Wins: " + numOfWin);
        System.out.println("Losses: " + numOfLose);
        
    }

}
