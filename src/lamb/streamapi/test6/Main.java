package lamb.streamapi.test6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("Moscow", "NY", "Tokyo");
        list.stream()
                .filter(x-> x.length() >= 3)
                .filter(x-> x.contains("M"))
                .forEach(System.out::println);
    }
}
