import java.util.Scanner;

public class Evenlinearsearch {
    public static void main(String[] args) {
        int [] arr={10,2,33,66,78,20};
        Scanner sc=new Scanner(System.in);

        System.out.println(search(arr));
    }
    static int search(int arr[]){
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i] +"found at index no:"+i);

            }

        }
        return  0;
    }
}
