class ShellSort{
    
    public static void sort(Comparable[] arr){
        int h = 1; 
        while (h < arr.length/3) h = 3 * h + 1; // Knuth increment subsequence
        while (h >= 1){
            for (int i = h; i < arr.length; i++){
                for (int j = i; j >= h ; j -= h){
                    if (arr[j].compareTo(arr[j-h]) < 0){
                        Comparable temp; 
                        temp = arr[j]; 
                        arr[j] = arr[j-h]; 
                        arr[j-h] = temp; 
                    }
                }
            }
            h /= 3; 
        }
    }
    public static void main(String[] args){
        Comparable[] arr = {"S","H","E","L","L","S","O","R","T","E","X","A","M","P","L","E"}; 
        sort(arr); 
        for (Comparable i : arr) {
            System.out.print(i); 
        }
        System.out.println(); 
    }
}
