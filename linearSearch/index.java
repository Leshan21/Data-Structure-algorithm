package linearSearch;

public class index {
    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
    int count;
    void linearSearch(int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                System.out.println(data+" is found in index "+ i);
                break;
            }
            count++;
        }
        if (count == arr.length) {
           System.out.println("Data is not in array!!"); 
        }
    }
    public static void main(String[] args) {
        
        index ll = new index();
        ll.linearSearch(35);
    }
}
