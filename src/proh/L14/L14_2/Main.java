package proh.L14.L14_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,5,6);
        arr.forEach(elem -> System.out.print(elem));
    }
}
