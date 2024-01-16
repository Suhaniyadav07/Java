import java.util.Arrays;

class Insertion {
    public static void main(String[] args) {
        int[] arr = {5, 3,2,1};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }

            }
        }
        return -1;
    }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
