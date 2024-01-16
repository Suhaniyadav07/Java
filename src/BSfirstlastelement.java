import java.util.Arrays;

public class BSfirstlastelement {
    public static void main(String[] args) {
        int []nums={5,7,7,7,7,8,8,10};
        int target=7;
        int []ans=search(nums,target);
        System.out.println(Arrays.toString(ans));


    }
    static int []search(int[]nums,int target){
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int start=0;
        int end=nums.length;
        int []result={-1,-1};
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;


            }
            else {
                mid=end;
            }

        }

        if(nums[start]!=target){
            return new int[]{-1,-1};

        }
        result[0]=start;
        end=nums.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<= target){
                start=mid+1;


            }
            else {
                mid=end;
            }

        }
        result[1]=start-1;
        return result;




}
}
