package Fourteen_Spisok;


import java.util.ArrayList;
import java.util.List;

public class Spisok {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(0, 105);


        System.out.println(list.size());
        System.out.println();


        for (int n : list) {
            System.out.println(n);


        }
    }
}
