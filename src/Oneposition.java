public class Oneposition {
    public static void main(String[] args) {
        int []nums={5,7,7,8,8,10};
        int target=8;
        int ans=search(nums,target);
        System.out.println(ans );

    }
   static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;
                }
                else if(nums[mid]>target){
                    end=mid+1;
                }
                else {
                    return mid;
                }

        }
        return -1;
    }
}
