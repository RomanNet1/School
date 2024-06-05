package lamb.streamapi.test11_sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo", "1", "2");

        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::print);

        System.out.println();

        List<String> list2 = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo", "1", "2");

        list2.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
