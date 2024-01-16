import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int [] arr={10,20,30,40};

        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        System.out.println(search(arr,search));

    }
    static int  search(int arr[],int searc){
        for(int i=0;i<arr.length;i++){
            if(searc==arr[i]){
                System.out.println(searc+"found at "+i);
                return 1;
            }

        }
        return -1;
    }
}
