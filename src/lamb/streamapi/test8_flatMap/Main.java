package lamb.streamapi.test8_flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwe wert tyy");
        list.add("qwe wert df");
        list.add("qwe wert df");

        long count = list.stream()
                .flatMap(value -> Arrays.stream(value.split(" ")))
                .count();
        System.out.println(count);
    }
}
