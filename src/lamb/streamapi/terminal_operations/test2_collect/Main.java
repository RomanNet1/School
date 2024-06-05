package lamb.streamapi.terminal_operations.test2_collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo", "1", "2", "one");

        List<String> newlist = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newlist);


    }
}
