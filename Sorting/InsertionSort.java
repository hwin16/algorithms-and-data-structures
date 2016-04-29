public class InsertionSort {
    // consider one element at a time, then insert it at proper place
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]) { 
                    int temp; 
                    temp = arr[j]; 
                    arr[j] = arr[j-1]; 
                    arr[j-1] = temp; 
                }
            }    
        }
    }

    public static void main(String[] args){
        int[] arr = {7, 5, 4, 8, 9, 3, 1, 2}; 
        sort(arr); 
        for (int i: arr){
            System.out.print(i); 
        }
        System.out.println(); 
    }
}
