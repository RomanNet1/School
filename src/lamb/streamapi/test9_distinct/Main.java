package lamb.streamapi.test9_distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo");

        list = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
