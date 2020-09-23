
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int small = array[0];
        for (int num:array){
            if (num < small){
                small = num;
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int small = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < small){
                small = array[i];
                index = i;
            }
        }
        return index;   
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int small = table[startIndex];
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < small){
                small = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length;i ++){
            int small = indexOfSmallestFrom(array, i);
            swap(array, i, small);
        }
    }
}
