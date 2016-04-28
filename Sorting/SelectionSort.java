// O(N^2)
// go through array. search for lowest, then exchange with current index
public class SelectionSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int minimum = i; 
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[minimum]) minimum = j; 
            }
            int temp; 
            temp = array[i]; 
            array[i] = array[minimum]; 
            array[minimum] = temp; 
        }
    }

    public static void main(String[] args){
        int[] array = {4, 6, 1, 2, 7, 6, 8, 0, 9}; 
        sort(array); 
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]); 
        }
        System.out.println(); 
    }
}
