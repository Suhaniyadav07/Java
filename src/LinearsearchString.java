import java.util.Scanner;

public class LinearsearchString {
    public static void main(String[] args) {
        String [] arr={"suhani","takshu","bhumika"};
        Scanner sc=new Scanner(System.in);
        String Search="takshu";
        System.out.println(Search(arr,Search));


    }
    static boolean Search(String arr[],String searc)
    {
        for (int i=0;i< arr.length;i++){
            if(searc==arr[i]){
                System.out.println(searc+"present at index no:"+i);
                return true;

            }

    }
        return false;
    }
}
