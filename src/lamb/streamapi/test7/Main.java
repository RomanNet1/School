package lamb.streamapi.test7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("Moscow", "NY", "Tokyo");
        list.stream()
                .map(String::toUpperCase)
                .map(x-> x + " <3")
                .forEach(System.out::println);
    }

}
