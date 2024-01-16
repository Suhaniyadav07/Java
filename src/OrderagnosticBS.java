public class OrderagnosticBS {
    public static void main(String[] args) {
        int [] arr={10,11,12,13,14,15,16,17,18};
        int value=13;
        int ans=(search(arr,value));
        System.out.println(ans);
    }
    static  int search(int arr[],int value){
        int start=0;
        int end=arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;

        }
        else{
            isAsc=false;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==value){
                return mid;
            }
            if (isAsc) {
                if (value < arr[mid]) {
                    end = mid - 1;

                }

            else if (value>arr[mid]) {
                    start = mid + 1;
                }
            }
            else {
                if (value>arr[mid]){
                    end=mid-1;

                }
          else if (value<arr[mid]){
                start=mid+1;
               }
            }
           // else return mid;
        }
     return -1;
    }
}
