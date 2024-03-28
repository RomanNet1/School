package lamb.p_2_15;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> conv = x -> x + " Доллоров";
        Function<Long, Long> conv1 = x -> x + 1;
        Function<Long, Long> conv2 = x -> x + 1;

        //Runnable hello = () - > sou

        String a =  conv.apply(7);
        System.out.println(a);
    }
}
