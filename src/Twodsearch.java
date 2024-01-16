import java.util.Scanner;

public class Twodsearch {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40},
                {11,12,13,14},
                {45,67,89,90}};
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println(search(arr,value));

    }
    static int  search(int  arr[][],int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println(value + "present at" + i+"  "+j);
                    return 1;

                }

            }
                    }
        return -1;

    }
}
