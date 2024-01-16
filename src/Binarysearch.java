public class Binarysearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int value=6;
        int ans=search(arr,value);
        System.out.println(ans );
    }
    static int search(int arr[],int value){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (value<arr[mid]){
                end=mid-1;
            } else if (arr[mid]<value) {
                start=mid+1;


            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
