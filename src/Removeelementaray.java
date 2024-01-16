//public class Removeelementaray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int element = 30;
//        int newarr=remove(arr,element);
//        System.out.println(newarr);
//    }
//
//    static int remove(int arr[], int element) {
//        int newarr = arr.length;
//        for (int i = 0; i < newarr; i++) {
//            if (arr[i] == element) {
//                newarr=arr[i]-element;
//                for (int j=i;j<newarr-1;j++){
//                    arr[j]=arr[j+1];
//                }
//                newarr--;
//                i--;
//            }
//
//            }
//        return newarr;
//        }
//
//
//    }
//
public class Removeelementaray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int element = 30;
        int newLength = remove(arr, element);
        System.out.println(newLength);
        System.out.println(arr);
    }

    static int remove(int arr[], int element) {
        int newLength = arr.length;

        for (int i = 0; i < newLength; i++) {
            if (arr[i] == element) {
                // Shift elements to the left starting from the found index
                for (int j = i; j < newLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                // Decrease the size of the array
                newLength--;

                // Adjust the loop counter to recheck the current index
                i--;
            }
        }

        return newLength;
    }
}
