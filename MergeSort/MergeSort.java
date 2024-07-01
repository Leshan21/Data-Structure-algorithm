package MergeSort;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
}
