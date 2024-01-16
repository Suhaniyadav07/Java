public class BStosearchinmountainarray {
    public static void main(String[] args) {
    int []arr={0,1,3,5,4,2};
    int target=3;
    int ans=peakindexinmountainArray(arr);
        System.out.println();
    }
    int searchbs(int []arr,int target){
        int peak=peakindexinmountainArray(arr);
        int firsttry=search(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return search(arr,target,peak+1,arr.length-1 );
    }

    static int peakindexinmountainArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;


    }
static int search(int[] arr,int target,int start,int end) {

    boolean isAsc;
    if (arr[start] < arr[end]) {
        isAsc = true;

    } else {
        isAsc = false;
    }
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (isAsc) {

        }
    }
    return -1;
}
}

