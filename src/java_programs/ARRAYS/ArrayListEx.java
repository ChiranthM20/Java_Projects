package java_programs.ARRAYS;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        boolean s = list.contains(30);
        System.out.println(s);


    }
}
