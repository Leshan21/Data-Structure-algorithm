package binarySearch;

public class index {
   
    static int binarySearch(int[] arry, int data){
        int start = 0;
        int end = arry.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arry[mid] == data) {
                return mid;
            }else if (arry[mid] < data) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1 ;
    }
    public static void main(String[] args) {
         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
         
         int result = binarySearch(arr, 34);
         System.out.println(result);
    }
}
