package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(35);
        list.add(123);
//        list.add(234);
//        list.add(23);
//        list.add(12);
//        list.add(987);
//        list.add(54);
//        list.add(208);
//        list.add(8456);
//        list.add(0);
//        list.add(234);

//        System.out.println(list.contains(234));
        list.set(2, 69);

        // length -> No!
        // size -> Yeah!
//        System.out.println(list.size());

        // arr[0] -> No!
        // list.get(0) -> Yeah!
//        System.out.println(list.get(2));

        // input -> Well, kinda the same shit
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
