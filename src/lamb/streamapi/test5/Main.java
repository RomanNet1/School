package lamb.streamapi.test5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("My", "Pen", "Is", "Black");
        list.stream()
                .filter(x-> x.length() == 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
