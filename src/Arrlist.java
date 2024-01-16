import java.util.ArrayList;
public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        //int[] l1={12,32,4,44,66};
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.println(list);
        list.set(0,2000);
        System.out.println(list);

    }
}
