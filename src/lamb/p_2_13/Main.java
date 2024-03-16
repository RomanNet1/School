package lamb.p_2_13;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> addInt = (x, y) -> x + y;
        int a =  addInt.apply(5,5);
        System.out.println(a);
    }
}
