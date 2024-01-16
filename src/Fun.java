public class Fun {
    public static void main(String[] args) {

        int[] arr={1,3,4,5,6,7};
        System.out.println(arr[2]);
        arr[2]=100;
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);

    }
    static void change(int[] num)
    {
        num[2]=200;
    }
}
