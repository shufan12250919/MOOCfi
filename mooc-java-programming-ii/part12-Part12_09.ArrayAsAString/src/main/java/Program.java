
public class Program {
    
    public static String arrayAsString(int[][] array){
        StringBuilder temp = new StringBuilder();
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                temp.append(array[i][j]);
            }
            temp.append("\n");
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        // Test your method here
    }

}
