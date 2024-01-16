import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = maxindex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    static void swap(int[] arr, int t, int s) {
        int temp = arr[t];
        arr[t] = arr[s];
        arr[s] = temp;
    }

    static int maxindex(int arr[], int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
