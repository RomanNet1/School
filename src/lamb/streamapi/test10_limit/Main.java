package lamb.streamapi.test10_limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mo11scow", "N22Y", "Tokyo", "NY", "Tokyo");

        list = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
