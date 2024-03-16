package lamb.p_2_11;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> atleast5 = x -> x > 5;
        System.out.println(atleast5.test(4));
    }
}
